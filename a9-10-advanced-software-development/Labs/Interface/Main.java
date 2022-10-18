import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Commands");
    System.out.println("1: View accounts");
    System.out.println("2: Create account");
    System.out.println("3: View balance");
    System.out.println("4: Deposit");
    System.out.println("5: Withdraw");
    System.out.println("6: Login");
    System.out.println("7: Logout");
    System.out.println("8: Set new key");
    System.out.println("9: Set new username");

    ArrayList<CheckingAccount> accounts = new ArrayList<CheckingAccount>();

    while (true) {
      System.out.print("Do: ");
      int todo = scan.nextInt();
      if (todo == 1) {
        displayAccounts(accounts);
      }
      else if (todo == 2) {
        System.out.print("Enter key: ");
        int key = scan.nextInt();
        System.out.print("Enter username: ");
        scan.nextLine();
        String username = scan.nextLine();
        System.out.print("Enter balance: ");
        float balance = scan.nextFloat();
        accounts.add(new CheckingAccount(key, username, balance));
      }
      else if (todo == 3) {
        int account = selectAccount(accounts);
        float balance = accounts.get(account).getBalance();
        if (balance == 0) {
          System.out.println("No balance available");
          continue;
        }
        System.out.println(balance);
      }
      else if (todo == 4) {
        int account = selectAccount(accounts);
        System.out.print("Enter deposit: ");
        float deposit = scan.nextFloat();
        accounts.get(account).deposit(deposit);
      }
      else if (todo == 5) {
        int account = selectAccount(accounts);
        System.out.print("Enter withdraw: ");
        float withdraw = scan.nextFloat();
        accounts.get(account).withdraw(withdraw);
      }
      else if (todo == 6) {
        int account = selectAccount(accounts);
        System.out.print("Enter key: ");
        int key = scan.nextInt();
        accounts.get(account).login(key);
      }
      else if (todo == 7) {
        int account = selectAccount(accounts);
        accounts.get(account).logout();
      }
      else if (todo == 8) {
        int account = selectAccount(accounts);
        System.out.print("Enter current key: ");
        int key = scan.nextInt();
        System.out.print("Enter new key: ");
        int newKey = scan.nextInt();
        accounts.get(account).setKey(key, newKey);
      }
      else if (todo == 9) {
        int account = selectAccount(accounts);
        System.out.print("Enter current key: ");
        int key = scan.nextInt();
        System.out.print("Enter new username: ");
        scan.nextLine();
        String username = scan.nextLine();
        accounts.get(account).setUsername(key, username);
      }
    }
  }

  public static void displayAccounts(ArrayList<CheckingAccount> a) {
    for (int i = 0; i < a.size(); i++) {
      System.out.println(i+1 + " " + a.get(i).getUsername());
    }
  }

  public static int selectAccount(ArrayList<CheckingAccount> a) {
    displayAccounts(a);
    System.out.print("Select account: ");
    int account = scan.nextInt();
    return account-1;
  }
}