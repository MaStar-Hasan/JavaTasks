package OOP.MobileApp;
public class MobileApp {

    public static void main(String[] args) {
        System.out.println("STUDENT RECHARGE SYSTEM");

        MobileConnection.setMinBal(10.0);

        MobileConnection obj1 = new MobileConnection("0771342223", "Hasan", 50.0);
        MobileConnection obj2 = new MobileConnection("0714445556", "Noah", 15.0);

        obj2.recharge(20.0);

        boolean result = obj1.makeCall(15.0);
        System.out.println("Call status for Hasan: " + result);

        transferBalance(obj1, obj2, 20.0);

        System.out.println("Hasan balance: " + obj1.getBalance());
        System.out.println("Noah balance: " + obj2.getBalance());

        MobileConnection.showTotal();
    }

    public static void transferBalance(MobileConnection m1, MobileConnection m2, double amount) {
        System.out.println("Transferring money...");
        
        if (m1.makeCall(amount) == true) {
            m2.recharge(amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed");
        }
    }
}
