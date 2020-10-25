public class CreditPaymentService {
    public int calculate (int creditAmount, int years, double procent) {
        double monthlyRate = procent/12/100;
        double annuitetCoeff = monthlyRate*Math.pow(1+monthlyRate, years*12)/(Math.pow(1+monthlyRate, years*12)-1);
        int payment = (int) Math.round(creditAmount*annuitetCoeff);
        return payment;
    }
}