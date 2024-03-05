package InterfaceLatest;

public class InvalidOTPException extends Exception {
    private String Code;

    public String getCode(){
        return Code;
    }

    public  InvalidOTPException(String errorCode,String message){
        super(message);
        this.Code=errorCode;

    }


}
