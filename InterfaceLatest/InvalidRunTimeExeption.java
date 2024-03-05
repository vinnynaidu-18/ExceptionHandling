package InterfaceLatest;

public class InvalidRunTimeExeption extends Exception{
    private String code;

    public String getCode(){
        return code;
    }
     public InvalidRunTimeExeption(String code,String message){
        super(message);
        this.code=code;

    }
}
