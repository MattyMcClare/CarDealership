package CarDealership.Business;

public class Till {
    private double balance;

    public Till(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(double balance) {
        this.balance += balance;
    }

    public void decreaseBalance(double balance) {
        this.balance -= balance;
    }
}
