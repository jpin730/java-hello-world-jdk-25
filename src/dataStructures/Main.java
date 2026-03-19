package dataStructures;

public class Main {
    static void main() {
        // Static Arrays
        Integer[] array1 = {1, 2, 3, 4, 5};

        System.out.print("Elements of array1: ");
        for (Integer integer : array1) {
            System.out.print(integer + " ");
        }
        System.out.println();

        int[] array2 = new int[100];

        System.out.println("Length of array2: " + array2.length);
    }
}
