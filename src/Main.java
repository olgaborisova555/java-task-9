public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int newCreditAmount = 1_000_000;
        double newProcent = 9.99;
        int payment = service.calculate(newCreditAmount, 1, newProcent);
        System.out.println("Ваш ежемесячный платеж " + payment);

        payment = service.calculate(newCreditAmount, 2, newProcent);
        System.out.println("Ваш ежемесячный платеж " + payment);

        payment = service.calculate(newCreditAmount, 3, newProcent);
        System.out.println("Ваш ежемесячный платеж " + payment);
    }
}