package algorithm.implementation;

import java.util.List;

/**
 * kawnayeen
 * 6/9/18
 */
public class _9_BonAppetit {
    void bonAppetit(List<Integer> bill, int k, int b) {
        long sum = bill.stream().mapToInt(Integer::intValue).sum();
        long actualBill = (sum - bill.get(k)) / 2;
        if (b > actualBill) {
            System.out.println(b - actualBill);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
