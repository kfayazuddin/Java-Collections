import java.util.ArrayList;

import java.util.Collections;

public class CollectionClass {
    public static void main(String[] args) {
        /*On any data struction we can use */
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(22);
        arr.add(3);
        arr.add(43);
        arr.add(5);
        arr.add(69);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        Collections.sort(arr);
        System.out.println("Array List"+arr);
        // to reverse the list
        Collections.reverse(arr);
        System.out.println("Reverse list"+arr);
        // to get minimum value
        System.out.println("Minimum of arr:"+Collections.min(arr));
        // to get maximum value
        System.out.println("Maximum of arr:"+Collections.max(arr));
        // to get the frequency of given element
        System.out.println("Frequency of 3 is "+Collections.frequency(arr,3));
    }
}
