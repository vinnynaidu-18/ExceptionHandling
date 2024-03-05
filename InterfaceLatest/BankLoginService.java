package InterfaceLatest;

public interface BankLoginService {

    boolean login(String userName,String password) throws InvalidOTPException;

    }


