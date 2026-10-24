public class CheckingAccount extends Account{
    public static final double OverDraft_Limit=1_000_000;
    public CheckingAccount(double balance, String owner){
        super(balance, owner);
    }
    @Override
    public void withdraw(double amount){
        if (amount<=0 || amount >OverDraft_Limit){
            throw new IllegalArgumentException("Invalid amount");
        }
        setBalance(getBalance()-amount);
        System.out.println("Withdraw Successful");
    }
}
