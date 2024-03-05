package InterfaceLatest;

public interface BankOTPValidService extends BankLoginService{
    String generateOTP(String accountNumber);
   boolean validateOTP(String otp) throws Exception;
}
