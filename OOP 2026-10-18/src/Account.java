abstract public class Account {
    private double balance;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){}
    public Account(double balance, String owner){
        this.balance=balance;
        this.owner=owner;
    }
    public void deposit(double amount){
        if (amount<=0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance+=amount;
    }
    abstract public void  withdraw(double amount);
}
