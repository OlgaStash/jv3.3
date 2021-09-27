public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        int creditTerm = 24;
        double percent = 9.99;
        int creditPayment = (int) service.calculate(creditSum, creditTerm, percent);
        System.out.println(creditPayment);

    }
}
