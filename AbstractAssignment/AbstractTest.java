package AbstractAssignment;

public class AbstractTest {
    public static void main(String[] args) {
        SBIBank sbiBank=new SBIBank(10000,10000,600,700,800,900);
        HDFCBank hdfcBank=new HDFCBank(10000,10000,300,400,500,600);
        sbiBank.sendAmount();
        int sbiTotalAmountSend=  sbiBank.sbiTotalSendAmt;
        int hdfcTotalAmountSend=  hdfcBank.hdfcTotalSendAmt;
        if(sbiTotalAmountSend>hdfcTotalAmountSend){
            System.out.println("HDFC sent balance to SBI Bank"+ " " +hdfcTotalAmountSend);
            int remAmt=sbiTotalAmountSend-hdfcTotalAmountSend;
            System.out.println("Send This Remain Balance To HDFC Bank:"+ " " +remAmt);
            int remainAmt=sbiBank.sbiBalance-remAmt;
            sbiBank.sbiBalance=remainAmt;
            int newHdfcBankBalance=hdfcBank.hdfcBalance+remAmt;
            System.out.println("After Sending The Amount To HDFC Bank"+" "+remainAmt);
            System.out.println("After Receving The Amount From SBI Bank"+" "+newHdfcBankBalance);

        }if(hdfcTotalAmountSend>sbiTotalAmountSend){
            int remAmt2=sbiTotalAmountSend-hdfcTotalAmountSend;
            System.out.println("sbi credited:"+remAmt2);
            int remainAmt2=hdfcBank.hdfcBalance-remAmt2;
            hdfcBank.hdfcBalance=remainAmt2;
            int newSbiBankBalance=sbiBank.sbiBalance+remAmt2;
            System.out.println(remainAmt2);
            System.out.println(newSbiBankBalance);
        }



    }
}
