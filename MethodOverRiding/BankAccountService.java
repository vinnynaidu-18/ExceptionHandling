package MethodOverRiding;

public class BankAccountService {
        int fromAccountAmount = 1000;
        int toAccountAmount = 0;
        String fromAccount = null;
        String toAccount = null;
        //boolean login(String userName,String passWord){
        //return true;
        public boolean transfer(String fromMobileNumber,String toMobileNumber,int amount){
            System.out.println("from SuperClass BankAcconut");

            if(fromMobileNumber.equals("9908")){
                fromAccount = "111";
            }
            if(toMobileNumber.equals("8688")){
                toAccount = "222";
            }
            return this.booktransfer(fromAccount,toAccount,amount);
        }

        private boolean booktransfer(String fromAccount,String toAccount,int amount){

            toAccountAmount = toAccountAmount + amount;
            fromAccountAmount= fromAccountAmount + amount;

            return true;
        }
    }

