public class Account implements Lockable {
  
  private boolean loggedIn = false;
  private int key;
  private String username;

  public Account(int k, String u) {
    key = k;
    username = u;
    System.out.println("Succesfully created account");
  }

  public String getUsername() {
    return username;
  }

  public void login(int k) {
    if (checkKey(k)) {
      loggedIn = true;
      System.out.println("Succesfully logged in.");
    }
  }

  public void logout() {
    if (checkLogin()) {
      loggedIn = false;
      System.out.println("Succesfully logged out.");
    }
  }

  public void setKey(int oldKey, int newKey) {
    if (checkKey(oldKey)) {
      key = newKey;
      System.out.println("Succesfully changed key.");
    } 
  }

  public void setUsername(int k, String newUsername) {
    if (checkKey(k)) {
      username = newUsername;
      System.out.println("Succesfully changed username.");
    } 
  }

  public boolean checkLogin() {
    if (!loggedIn) {
      System.out.println("You must be logged in.");
    }
    return loggedIn;
  }

  public boolean checkKey(int k) {
    boolean r = k == key;
    if (!r) {
      System.out.println("Incorrect key entered.");
    }
    return r;
  }
}

