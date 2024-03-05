package InterfaceLatest;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankService implements BankOTPValidService {
    String accountNumber = "1111";
    String password = "555";
    String otp;
    Date otpExpiredTime;

    public SBIBankService() {

    }

    @Override
    public boolean login(String userName, String password) {
        if (userName.equals(accountNumber) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {
        if (this.accountNumber.equals(accountNumber)) {
             otp = UUID.randomUUID().toString();
             Calendar otpExpiryCalendar = Calendar.getInstance();
             otpExpiryCalendar.add(Calendar.SECOND,60);
            System.out.println("otpExpiryCalendar"+otpExpiryCalendar.getTime());
            otpExpiredTime=otpExpiryCalendar.getTime();
            return otp;
        }
        return null;
    }
    @Override
    public boolean validateOTP(String otp)  throws InvalidOTPException{
        if (this.otp.equals(otp)) {
            return true;
        } else {
            System.out.println("invalid otp");
            throw new InvalidOTPException(ErrorCode.NEOTERIC_ERROR_OTP_1000.getCode() ,ErrorCode.NEOTERIC_ERROR_OTP_1000.getCode());
        }

    }
}


