package InterfaceLatest;

public class RunTimeOTPException extends RuntimeException {
    private String code;

    public RunTimeOTPException(String code,String message){
        super(message);
        this.code=code;
    }
    public String getCode(){
        return code;
    }

}
