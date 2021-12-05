package Task2324;

import java.util.HashMap;
import java.util.Map;

public class CSVParser {
    private double income = 0;
    private double expense = 0;
    private final Map<String, Double> expenseList = new HashMap<>();

    public void CalculateData(String input) {
        String[] columns = input.split(",", 8);
        double incomeTmp = Double.parseDouble(columns[6]);
        double expenseTmp = Double.parseDouble(columns[7].
                replaceAll("\"", "").replace(',', '.'));
        if (incomeTmp == 0)
            calculateExpense(columns[5], expenseTmp);
        else
            this.income += incomeTmp;
    }

    private void calculateExpense(String expenseName, double expense) {
        this.expense += expense;
        String[] transaction = expenseName.trim().split(" {3,}");
        String[] temp = transaction[1].split("/");
        String[] suppliesTemp = temp[temp.length - 1].split("\\\\");
        String supplies = suppliesTemp[suppliesTemp.length - 1];
        if (!expenseList.containsKey(supplies))
            expenseList.put(supplies, expense);
        else {
            double sum = expenseList.get(supplies);
            sum += expense;
            expenseList.put(supplies.trim(), sum);
        }
    }
    public void printCSV() {
        System.out.printf("Сумма расходов: %.2f руб.\n", expense);
        System.out.printf("Сумма доходов: %.2f руб.\n", income);
        System.out.println("Расходы по организациям:");
        for (String supplies : expenseList.keySet()) {
            System.out.printf("%-30s    %.2f %-10s\n", supplies, expenseList.get(supplies), "руб.");
        }
    }
}
