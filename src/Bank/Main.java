package Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Itallo" , 500);
        System.out.println(bankAccount.toString());
        bankAccount.deposit(200.0);
        System.out.println(bankAccount.toString());
        bankAccount.withdraw(500.0);
        System.out.println(bankAccount.toString());
    }
}
