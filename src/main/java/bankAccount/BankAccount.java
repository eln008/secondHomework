package bankAccountClass;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("пополнение: " + amount);
        } else System.err.println("отричательная сумма!");
    }
    public void snyatie(double amount){
        if (amount > 0 && balance >= amount){
            balance-=amount;
            System.out.println("снятие: "+amount);
        } else System.err.println("недостатчоно средств или неправильная сумма!");
    }
    public void displayBalance (){
        System.out.println("текущий баланс: "+balance);
    }

}
