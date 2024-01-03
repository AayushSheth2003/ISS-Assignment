import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Operations on ArrayList
        System.out.println("ArrayList Operations:");
        System.out.println("Original List: " + myList);

        // 1. Add an element
        myList.add(6);
        System.out.println("After adding 6: " + myList);

        // 2. Remove an element
        myList.remove(Integer.valueOf(3));
        System.out.println("After removing 3: " + myList);

        // 3. Get an element by index
        int elementAtIndex = myList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        // 4. Check if the list contains an element
        boolean containsFive = myList.contains(5);
        System.out.println("Contains 5? " + containsFive);

        // 5. Size of the list
        int sizeOfList = myList.size();
        System.out.println("Size of the list: " + sizeOfList);

        System.out.println("\n---------------------------------\n");

        // Set
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);

        // Operations on HashSet
        System.out.println("HashSet Operations:");
        System.out.println("Original Set: " + mySet);

        // 1. Add an element
        mySet.add(6);
        System.out.println("After adding 6: " + mySet);

        // 2. Remove an element
        mySet.remove(3);
        System.out.println("After removing 3: " + mySet);

        // 3. Check if the set contains an element
        boolean containsFour = mySet.contains(4);
        System.out.println("Contains 4? " + containsFour);

        // 4. Size of the set
        int sizeOfSet = mySet.size();
        System.out.println("Size of the set: " + sizeOfSet);

        // 5. Clear the set
        mySet.clear();
        System.out.println("After clearing the set: " + mySet);

        System.out.println("\n---------------------------------\n");

        // Map
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 1);
        myMap.put("b", 2);
        myMap.put("c", 3);

        // Operations on HashMap
        System.out.println("HashMap Operations:");
        System.out.println("Original Map: " + myMap);

        // 1. Add/update a key-value pair
        myMap.put("d", 4);
        System.out.println("After adding 'd': " + myMap);

        // 2. Remove a key-value pair
        myMap.remove("b");
        System.out.println("After removing 'b': " + myMap);

        // 3. Get value by key
        int valueForKeyC = myMap.get("c");
        System.out.println("Value for key 'c': " + valueForKeyC);

        // 4. Check if the map contains a key
        boolean containsKeyA = myMap.containsKey("a");
        System.out.println("Contains key 'a'? " + containsKeyA);

        // 5. Size of the map
        int sizeOfMap = myMap.size();
        System.out.println("Size of the map: " + sizeOfMap);
    }
}
