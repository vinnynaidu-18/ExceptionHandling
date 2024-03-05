package InterfaceLatest;

public enum ErrorCode {
    NEOTERIC_ERROR_OTP_1000("NEOTERIC ERROR 1000","Invalid OTP"),
        NEOTERIC_EXPIRY_OTP_1001("NEOTERIC_EX_OTP","Expired OTP");
    String code;
    String message;
    public String getMessage(){
        return message;
    }
    public String getCode() {
        return code;
    }
        ErrorCode(String code,String message){
        this.code=code;
        this.message=message;
        }

}
