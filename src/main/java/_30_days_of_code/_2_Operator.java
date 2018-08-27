package _30_days_of_code;

public class _2_Operator {
    public int calculateTotalCost(double mealCost, int tipPercent, int taxPercent) {
        int totalAddUpPercent = tipPercent + taxPercent;
        double totalAddUp = (mealCost * totalAddUpPercent) / 100.0;
        double totalCost = mealCost + totalAddUp;
        return (int) Math.round(totalCost);
    }
}
