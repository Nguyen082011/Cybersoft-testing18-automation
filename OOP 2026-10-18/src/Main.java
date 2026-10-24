//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        tài khoảng ngân hàng
//        saving account +không được rút quá số dư
//        checking account +rút max 1.000.000vnd
//        Account -> class cha
//        saving account -> class con
//        checking account -> class con
        SavingAccount account1 = new SavingAccount(1_000_000, "An");
//        account1.withdraw(2_000_000);
        account1.withdraw(300_000);
        System.out.println(account1.getBalance());
        CheckingAccount account2 = new CheckingAccount(1_000_000, "Bình");
        account2.withdraw(1_200_000);
    }
}