package financialForecasting;
public class LoanEMIForecaster {
    public double calculateEMI(double principal, double annualRate, int tenureYears) {
        double monthlyRate = annualRate / 12 / 100; // Monthly interest rate
        int tenureMonths = tenureYears * 12;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
               (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }
    public double calculateTotalPayment(double emi, int tenureYears) {
        return emi * tenureYears * 12;
    }
    public double calculateTotalInterest(double totalPayment, double principal) {
        return totalPayment - principal;
    }
}

