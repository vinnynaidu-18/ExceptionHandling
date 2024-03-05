package AbstractAssignment;


    public abstract class RBIBank {
        protected int sbiBalance;
        protected int hdfcBalance;

        public RBIBank(int sbiBalance, int hdfcBalance) {
            this.sbiBalance = sbiBalance;
            this.hdfcBalance = hdfcBalance;
        }


        public abstract void sendAmount();
        public double getBalance(){
            return getBalance();
        }
}
