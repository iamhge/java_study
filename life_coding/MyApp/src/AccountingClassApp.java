import java.util.AbstractCollection;

class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply : " + valueOfSupply); // 공급가 (소비자에게 받은 )
        System.out.println("VAT : " + getVAT()); // 부가가치세
        System.out.println("Total : " + getTotal()); // 부가가치세 + 공급가돈
        System.out.println("Expense : " + getExpense()); // 비용
        System.out.println("Income : " + getIncome()); // 순익
        System.out.println("Dividend : " + getDividend(0));
        System.out.println("Dividend : " + getDividend(1));
        System.out.println("Dividend : " + getDividend(2));
    }

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private double getTotal() {
        return valueOfSupply + getVAT();
    }

    private double getVAT() {
        return getExpense();
    }

    private double getDividendRate(int i) {
        double[] dividendRate = {0.5, 0.3, 0.2};
        return dividendRate[i];
    }

    private double getDividend(int i) {
        return getIncome() * getDividendRate(i);
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {
        // instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0; //Double.parseDouble(args[0]);
        a1.vatRate = 0.1; //Double.parseDouble(args[1]);
        a1.expenseRate = 0.3; //Double.parseDouble(args[2]);
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0; //Double.parseDouble(args[0]);
        a2.vatRate = 0.05; //Double.parseDouble(args[1]);
        a2.expenseRate = 0.2; //Double.parseDouble(args[2]);
        a2.print();
    }
}
