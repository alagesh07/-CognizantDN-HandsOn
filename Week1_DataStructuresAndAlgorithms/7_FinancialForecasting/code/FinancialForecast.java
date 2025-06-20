public class FinancialForecast {

    public static double predictFutureValue(double currentValue, double rate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;
        double growthRate = 0.07;
        int years = 5;

        double futureValue = predictFutureValue(presentValue, growthRate, years);

        System.out.println("------ Financial Forecast ------");
        System.out.println("Initial Value: ₹" + presentValue);
        System.out.println("Annual Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years Forecasted: " + years);
        System.out.printf("Predicted Future Value: ₹%.2f\n", futureValue);
    }
}
