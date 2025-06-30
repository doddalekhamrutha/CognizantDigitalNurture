package financialForecasting;
import java.util.Scanner;

public class LoanEMIDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanEMIForecaster forecaster = new LoanEMIForecaster();

        System.out.println("=== Loan EMI & Interest Forecaster ===");

        System.out.print("Enter Loan Principal Amount (₹): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Loan Tenure (in years): ");
        int tenureYears = scanner.nextInt();

        double emi = forecaster.calculateEMI(principal, annualRate, tenureYears);
        double totalPayment = forecaster.calculateTotalPayment(emi, tenureYears);
        double totalInterest = forecaster.calculateTotalInterest(totalPayment, principal);

        System.out.printf("\nMonthly EMI: ₹%.2f", emi);
        System.out.printf("\nTotal Payment: ₹%.2f", totalPayment);
        System.out.printf("\nTotal Interest Payable: ₹%.2f\n", totalInterest);

        scanner.close();
    }
}

