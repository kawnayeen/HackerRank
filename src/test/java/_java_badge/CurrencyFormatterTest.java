package _java_badge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyFormatterTest {

    @Test
    public void formatCurrency() {
        CurrencyFormatter formatter = new CurrencyFormatter();
        formatter.formatCurrency(17.5);
    }
}