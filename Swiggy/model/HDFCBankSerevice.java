package Swiggy.model;

import java.util.Date;
import java.util.UUID;
import java.util.logging.LogManager;

    public class HDFCBankSerevice  extends  SBIBankService {
    private Long mobileNo;
    private String OTP;
    private String creditCardNo = "222";
    private double creditCardAmt = 4000;

    public String Login(Long mobileNo, String OTP) {
        return "login successful";
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public String getOTP() {
        return OTP;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public double getCreditCardAmt() {
        return creditCardAmt;
    }

    public HDFCBankSerevice(Long mobileNo, String OTP, String creditCardNo, double creditCardAmt) {
        this.mobileNo = mobileNo;
        this.OTP = OTP;
        this.creditCardAmt = creditCardAmt;
        this.creditCardNo = creditCardNo;
 }

    public PaymentResponse transfer(PaymentRequest request) {
        System.out.println(request.getTxId());
        if (request.isMerchantDebit()) {
            creditCardAmt = creditCardAmt - request.getAmt();
            creditCardAmt = creditCardAmt + getCreditCardAmt();

        } else {
            creditCardAmt = creditCardAmt - getCreditCardAmt();
            creditCardAmt = creditCardAmt+request.getAmt();
        }
        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(), "Success", new Date());
        return response;
    }
}
