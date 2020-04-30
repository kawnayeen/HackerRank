package _java_badge;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public void formatCurrency(double payment) {
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // Write your code here.

        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + frenchFormat.format(payment));
    }
}
