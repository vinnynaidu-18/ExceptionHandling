package AbstractAssignment;

    public class HDFCBank extends RBIBank{
        int person1 =300;
        int person2 =400;
        int person3 =500;
        int person4 =600;

        int hdfcTotalSendAmt = person1 + person2 + person3 + person4;

        public HDFCBank(int sbiBalance, int hdfcBalance, int person1, int person2, int person3, int person4) {
            super(sbiBalance, hdfcBalance);
            this.person1 = person1;
            this.person2 = person2;
            this.person3 = person3;
            this.person4 = person4;

        }

        @Override
        public String toString() {
            return "HDFCBank{" +
                    "person1=" + person1 +
                    ", person2=" + person2 +
                    ", person3=" + person3 +
                    ", person4=" + person4 +
                    ", sbiTotalSendAmt=" + hdfcTotalSendAmt +
                    ", sbiBalance=" + sbiBalance +
                    ", hdfcBalance=" + hdfcBalance +
                    '}';
        }

        @Override
        public void sendAmount() {
            if (sbiBalance >= hdfcTotalSendAmt) {

                System.out.println(hdfcTotalSendAmt);
            } else {
                System.out.println("Not Transfered");
            }

        }
    }

