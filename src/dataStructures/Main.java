package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;

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

        // Primitive Arrays vs Wrapper Arrays
        int[] primitiveArray = new int[5];

        primitiveArray[0] = 10;
        primitiveArray[1] = 20;

        System.out.print("Elements of primitiveArray: ");
        for (int number : primitiveArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        Integer[] wrapperArray = new Integer[5];

        wrapperArray[0] = 30;
        wrapperArray[1] = 40;

        System.out.print("Elements of wrapperArray: ");
        for (Integer number : wrapperArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Dynamic Arrays
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Elements of arrayList: " + arrayList);

        // Hashset
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(10); // repeated
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        System.out.println("hashSet = " + hashSet);

        hashSet.remove(20);

        System.out.println("hashSet after removing 20 = " + hashSet);
    }
}
