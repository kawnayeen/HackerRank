package algorithm.implementation;

public class _14_CatAndMouse {
    public static final String CAT_A = "Cat A";
    public static final String CAT_B = "Cat B";
    public static final String MOUSE_C = "Mouse C";

    String catAndMouse(int x, int y, int z) {
        int distanceForCatA = Math.abs(z - x);
        int distanceForCatB = Math.abs(z - y);
        if (distanceForCatA == distanceForCatB)
            return MOUSE_C;
        if (distanceForCatA < distanceForCatB)
            return CAT_A;
        return CAT_B;
    }
}
