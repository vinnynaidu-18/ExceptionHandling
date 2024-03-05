package InterfaceLatest;

public class HDFCBankSerive implements BankLoginService{
    String accountNumber="222";
    String password="555";

    @Override
    public boolean login(String userName, String password) {
        if(userName.equals(accountNumber)&&this.password.equals(password)){
            return true;
        }
        return false;
    }
}
