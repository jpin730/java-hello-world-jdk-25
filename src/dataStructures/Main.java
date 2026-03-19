package dataStructures;

import java.util.*;

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

        // Hashset of Custom Classes
        HashSet<Person> personSet = new HashSet<>();
        Person person1 = new Person("Alice", "123");
        Person person2 = new Person("Bob", "456");
        Person person3 = new Person("Charlie", "123"); // Same ID as person1

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3); // This will not be added because of the same ID

        System.out.println("personSet = " + personSet);

        personSet.remove(person1);

        System.out.println("personSet = " + personSet);

        personSet.add(person3);

        System.out.println("personSet = " + personSet);

        // TreeSet
        TreeSet<Person> personTreeSet = new TreeSet<>();

        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3); // This will not be added because of the same ID

        Person person4 = new Person("David", "789");
        personTreeSet.add(person4);

        System.out.println("personTreeSet = " + personTreeSet);

        // HashMap
        HashMap<String, Integer> nameAgeHashMap = new HashMap<>();

        nameAgeHashMap.put("Alice", 30);
        nameAgeHashMap.put("Bob", 25);
        nameAgeHashMap.put("Charlie", 35);

        System.out.println("nameAgeHashMap = " + nameAgeHashMap);

        System.out.println("Alice's age: " + nameAgeHashMap.get("Alice"));

        nameAgeHashMap.put("Alice", 31); // Update Alice's age

        System.out.println("nameAgeHashMap = " + nameAgeHashMap);

        nameAgeHashMap.remove("Bob");

        System.out.println("nameAgeHashMap = " + nameAgeHashMap);

        // TreeMap
        TreeMap<String, Integer> nameAgeTreeMap = new TreeMap<>(nameAgeHashMap);

        nameAgeTreeMap.put("David", 28);
        nameAgeTreeMap.put("Eve", 22);
        nameAgeTreeMap.put("Charlie", 36); // Update Charlie's age

        System.out.println("nameAgeTreeMap = " + nameAgeTreeMap);
    }
}
