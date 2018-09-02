package datastructure.array;

public class _4_LeftRotate {
    public int[] rotateLeft(int numberOfRotation, int[] arr) {
        int arraySize = arr.length;
        numberOfRotation = numberOfRotation % arraySize;
        int[] tempStorage = new int[numberOfRotation];
        System.arraycopy(arr, 0, tempStorage, 0, numberOfRotation);
        System.arraycopy(arr, numberOfRotation, arr, 0, arraySize - numberOfRotation);
        System.arraycopy(tempStorage, 0, arr, arraySize - numberOfRotation, numberOfRotation);
        return arr;
    }
}
