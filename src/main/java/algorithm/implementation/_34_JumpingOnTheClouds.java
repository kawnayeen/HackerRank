package algorithm.implementation;

public class _34_JumpingOnTheClouds {
    int jumpingOnClouds(int[] c) {
        int numberOfJump = 0;
        int currentPosition = 0;
        while (currentPosition < c.length) {
            if (currentPosition == c.length - 1)
                break;
            int nextPosition = currentPosition + 2;
            if (nextPosition < c.length && c[nextPosition] == 0)
                currentPosition = nextPosition;
            else
                currentPosition = currentPosition + 1;
            numberOfJump++;
        }
        return numberOfJump;
    }
}
