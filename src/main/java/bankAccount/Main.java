package bankAccountClass;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount( "234242114",100);
        bankAccount.deposit(50);
        bankAccount.displayBalance();

        bankAccount.snyatie(25);
        bankAccount.displayBalance();
    }
}
