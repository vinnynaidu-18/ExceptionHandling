package MethodOverRiding;


    public class PhonePayService extends BankAccountService{
        public boolean transfer(String fromMobileNumber,String toMobileNumber,int amount){
            System.out.println("from subClass BankAccount");
            return super.transfer(fromMobileNumber,toMobileNumber,amount);

        }

    }

