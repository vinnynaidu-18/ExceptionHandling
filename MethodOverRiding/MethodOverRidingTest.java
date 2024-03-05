package MethodOverRiding;

public class MethodOverRidingTest {
    public static void main(String[] args) {
        PhonePayService phonePayService = new PhonePayService();
        phonePayService.transfer("9909", "8688", 100);
        phonePayService.transfer("9908", "8688", 200);
        phonePayService.transfer("9908", "8688", 100);
        System.out.println("To Account money=" + phonePayService.toAccountAmount);
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.transfer("2244","4455",100);
        BankAccountService bankAccountServiceupcasting = new PhonePayService();
        bankAccountServiceupcasting.transfer("1234","3344",200);

    }
}


