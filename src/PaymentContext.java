public class PaymentContext {
    private PaymentInterface payment;

    public PaymentContext(PaymentInterface payment) {
        this.payment = payment;
    }

    public void setPayment(PaymentInterface payment) {
        this.payment = payment;
    }

    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return;
        }

        payment.pay(amount);
    }
}
