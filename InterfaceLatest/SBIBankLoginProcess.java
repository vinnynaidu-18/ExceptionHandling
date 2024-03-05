package InterfaceLatest;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService {


    SBIBankService sbiBankService;

    public SBIBankLoginProcess() {
        this.sbiBankService = new SBIBankService();

    }
    public SBIBankLoginProcess(SBIBankService sbiBankService) {
        this.sbiBankService = new SBIBankService();

    }
        @Override
        public boolean login (String userName, String password){
            if (sbiBankService.login(userName, password)) {
                String otp = sbiBankService.generateOTP(userName);
                boolean validateOtp = false;
                try{
                    validateOtp = sbiBankService.validateOTP(UUID.randomUUID().toString());
                }catch (InvalidOTPException exp){
                    System.out.println("Error Occured"+exp);
                    throw new RuntimeException();
                }catch (Exception e) {

                }
                if (validateOtp) {
                    System.out.println("Valid otp & login successful");

                } else {
                    System.out.println(" login failed");
                }

                return validateOtp;
            } else {
                System.out.println("Invalid Credentials");
                return false;
            }
        }

    }


