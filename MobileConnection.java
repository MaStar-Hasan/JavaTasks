public class MobileConnection {
    String mobileNumber;
    String customerName;
    double balance;

    static double minimumBalance;
    static int totalConnections = 0;

    public MobileConnection(String mobileNumber, String customerName, double balance) {
        this.mobileNumber = mobileNumber;
        this.customerName = customerName;
        this.balance = balance;
        totalConnections = totalConnections + 1;
    }

    public void recharge(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Recharge Successful!");
        System.out.println("New Balance: " + this.balance);
    }

    public boolean makeCall(double cost) {
        if ((this.balance - cost) >= minimumBalance) {
            this.balance = this.balance - cost;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void setMinBal(double min) {
        minimumBalance = min;
    }

    public static void showTotal() {
        System.out.println("Total connections is: " + totalConnections);
    }
}
