public class CashPayment implements PaymentInterface {
    @Override
    public void pay(double amount) {
        double fee = 200;
        double total = amount + fee;

        System.out.println("Payment method: cash");
        System.out.println("Amount: " + amount);
        System.out.println("Fee: " + fee);
        System.out.println("Total payment: " + total);
    }
}
