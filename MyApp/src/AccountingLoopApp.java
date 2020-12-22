public class AccountingLoopApp {
    public static void main(String[] args) {
        int i = 0;
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = Double.parseDouble(args[1]);
        double expenseRate = Double.parseDouble(args[2]);
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + valueOfSupply * vatRate;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double[] dividendRate = {0.5, 0.3, 0.2};
        double[] dividend = new double[3];

        System.out.println("Value of supply : " + valueOfSupply); // 공급가 (소비자에게 받은 )
        System.out.println("VAT : " + vat); // 부가가치세
        System.out.println("Total : " + total); // 부가가치세 + 공급가돈
        System.out.println("Expense : " + expense); // 비용
        System.out.println("Income : " + income); // 순익

        while (i < dividendRate.length) {
            dividend[i] = income * dividendRate[i];
            System.out.println("Dividend : " + dividend[i]);
            i += 1;
        }
    }
}
