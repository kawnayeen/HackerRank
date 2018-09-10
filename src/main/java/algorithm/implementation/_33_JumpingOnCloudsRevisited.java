package algorithm.implementation;

/**
 * kawnayeen
 * 10/9/18
 */
public class _33_JumpingOnCloudsRevisited {
    int jumpingOnClouds(int[] c, int k) {
        int initialPosition = 0;
        int energy = 100;
        while (initialPosition < c.length) {
            initialPosition += k;
            energy = energy - 1;
            if (initialPosition >= c.length) {
                initialPosition = initialPosition % c.length;
                if (c[initialPosition] == 1)
                    energy = energy - 2;
                break;
            }
            if (c[initialPosition] == 1)
                energy = energy - 2;
        }
        return energy;
    }
}
