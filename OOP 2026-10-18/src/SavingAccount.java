public class SavingAccount extends Account{
    public SavingAccount(double balance, String owner){
        super(balance, owner);
    }
    @Override
    public void withdraw(double amount){
        if (amount<=0 || amount>getBalance())
            throw new IllegalArgumentException("Invalid amount");
        setBalance(getBalance()-amount);
        System.out.println("Withdraw successful");
    }
}
