import java.text.NumberFormat;

public class LoanReport {

    private final NumberFormat currency;
    private LoanCalcu calculator;

    public LoanReport(LoanCalcu calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void printPayment() {
        double payment = calculator.calculateLoan();
        String mortgageFormatted = currency.format(payment);
        System.out.println();
        System.out.println("Loan");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}