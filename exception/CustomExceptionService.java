package exception;

public class CustomExceptionService {
    public String checkException() {
        try {
            throw new Exception("Throw CheckedExeption");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("From CheckedException method finally block");
        }

    }
    public String checkException2() throws Exception{
        throw new Exception("Throw CheckedExeption");
        }

    public String unCheckedExcception(){
        throw new RuntimeException("Throw unCheckedException ");

    }
}
