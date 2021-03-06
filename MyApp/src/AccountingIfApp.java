public class AccountingIfApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = Double.parseDouble(args[1]);
        double expenseRate = Double.parseDouble(args[2]);
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + valueOfSupply * vatRate;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double[] dividendRate = {0.5, 0.3, 0.2};
        double[] dividend = new double[3];

        if (income <= 10000.0) {
            dividendRate[0] = 1.0;
            dividendRate[1] = 0.0;
            dividendRate[2] = 0.0;
        }

//        double[] dividendRate = new double[3];

//        if (income <= 10000.0) {
//            dividendRate[0] = 1.0;
//            dividendRate[1] = 0.0;
//            dividendRate[2] = 0.0;
//        } else {
//            dividendRate[0] = 0.5;
//            dividendRate[1] = 0.3;
//            dividendRate[2] = 0.2;
//        }

        for (int i = 0 ; i < 3 ; i++ ) {
            dividend[i] = income * dividendRate[i];
        }

        System.out.println("Value of supply : " + valueOfSupply); // 공급가 (소비자에게 받은 )
        System.out.println("VAT : " + vat); // 부가가치세
        System.out.println("Total : " + total); // 부가가치세 + 공급가돈
        System.out.println("Expense : " + expense); // 비용
        System.out.println("Income : " + income); // 순익
        System.out.println("Dividend : " + dividend[0]); // 배당
        System.out.println("Dividend : " + dividend[1]);
        System.out.println("Dividend : " + dividend[2]);
    }
}
