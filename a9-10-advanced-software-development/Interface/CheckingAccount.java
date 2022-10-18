public class CheckingAccount extends Account  {
  
  private float balance;

  public CheckingAccount(int k, String u, float b) {
    super(k, u);
    balance = b;
  }

  public float getBalance() {
    if (checkLogin()) {
      return balance;
    }
    return 0;
  }

  public void deposit(float a) {
    balance += a;
    System.out.println("Succesfully deposited.");
  }

  public void withdraw(float a) {
    if (checkLogin()) {
      balance -= a;
      System.out.println("Succesfully withdrew.");
    }
  }
}
