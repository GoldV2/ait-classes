public interface Lockable {
  public void logout();
  public void login(int key);
  public boolean checkLogin();
}
