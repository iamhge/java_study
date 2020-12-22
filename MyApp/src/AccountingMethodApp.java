public class AccountingMethodApp {
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;
    
    public static void main(String[] args) {
        valueOfSupply = Double.parseDouble(args[0]);
        vatRate = Double.parseDouble(args[1]);
        expenseRate = Double.parseDouble(args[2]);

        print();
    }

    private static void print() {
        System.out.println("Value of supply : " + valueOfSupply); // 공급가 (소비자에게 받은 )
        System.out.println("VAT : " + getVAT()); // 부가가치세
        System.out.println("Total : " + getTotal()); // 부가가치세 + 공급가돈
        System.out.println("Expense : " + getExpense()); // 비용
        System.out.println("Income : " + getIncome()); // 순익
        System.out.println("Dividend : " + getDividend(0));
        System.out.println("Dividend : " + getDividend(1));
        System.out.println("Dividend : " + getDividend(2));
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVAT();
    }

    private static double getVAT() {
        return getExpense();
    }

    private static double getDividendRate(int i) {
        double[] dividendRate = {0.5, 0.3, 0.2};
        return dividendRate[i];
    }

    private static double getDividend(int i) {
        return getIncome() * getDividendRate(i);
    }
}
