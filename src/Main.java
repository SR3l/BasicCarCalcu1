public class Main {

    public static void main(String[] args) {
        int principal = (int) LoanConsole.readNumber("Car Loan Amount: ", 1000, 100000);
        float annualInterest = (float) LoanConsole.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) LoanConsole.readNumber("Period (Years): ", 1, 6);

        var calculator = new LoanCalcu(principal, annualInterest, years);

        var report = new LoanReport(calculator);
        report.printPayment();
        report.printPaymentSchedule();
    }

}
