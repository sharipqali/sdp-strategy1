public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CardPayment());

        context.pay(10000);

        System.out.println();

        context.setPayment(new MobilePayment());
        context.pay(10000);

        System.out.println();

        context.setPayment(new CashPayment());
        context.pay(10000);
    }
}
