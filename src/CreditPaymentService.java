public class CreditPaymentService {
    public double calculate(int creditSum, int creditTerm, double percent) {
        int monthPercent = (int) (percent / 100 * creditTerm);
        int lastTerm = -(creditTerm - 1);
        int creditPayment;
        creditPayment = (creditSum * monthPercent) / (1 - (1 + monthPercent) ^ lastTerm);
        return creditPayment;
    }
}
