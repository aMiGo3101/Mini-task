package Bank;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        }else{
            System.out.println("small balance: ");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Not enough money ");
            }

        }
    }


    @Override
    public String toString(){
        return "Bank account " + "owner: " + owner + " balance: " + balance;
    }


    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
}


