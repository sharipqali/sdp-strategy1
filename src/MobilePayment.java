public class MobilePayment implements PaymentInterface {
    @Override
    public void pay(double amount) {
        double fee = amount * 0.005;
        double total = amount + fee;

        System.out.println("Payment method: Mobile Wallet");
        System.out.println("Amount: " + amount);
        System.out.println("Fee: " + fee);
        System.out.println("Total payment: " + total);
    }
}
