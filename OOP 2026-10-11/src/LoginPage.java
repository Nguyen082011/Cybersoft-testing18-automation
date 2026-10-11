public class LoginPage {
//    thuộc tính: ô input username, password, nút login
    String username;
    String password;
    String loginBtn;

    public  LoginPage(){}
    public LoginPage(String username, String password, String loginBtn){
        this.username=username;
        this.password=password;
        this.loginBtn=loginBtn;
    }
    public void enterUsername(String username){
        System.out.println("Enter username: ");
        this.username=username;
    }
    public void enterPassword(String password){
        System.out.println("Enter password: ");
        this.password=password;
    }
    public void clickLoginBtn(){
        System.out.println("Click login button");
    }
    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }
    public boolean isLoginSucess(){
        if(username.equals("admin") && password.equals("Admin123")){
            return true;
        }
        return false;
    }
}
