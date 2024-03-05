package InterfaceLatest;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService = new SBIBankLoginProcess();
        try {
            boolean status = loginService.login("1111", "555");
            if (status) {
                System.out.println("login Successfull");
            } else {
                System.out.println("Login failed");
            }
        }catch (RunTimeOTPException e){
            System.out.println(e.getCode()+""+e.getMessage());

        } catch (InvalidOTPException e) {
            throw new RuntimeException(e);
        }
    }
}



