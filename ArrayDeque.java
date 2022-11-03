
/*1.)ArrayDeque elements can be added or removed from both the elements
 * 2.) ArrayDeque we can use for stack and queue both.
 * 3.)ArrayDeque is helpful in sliding window questions 
 */
public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> ad = new java.util.ArrayDeque<Integer>();
        ad.offer(10);// This will be addedin the end/last of the array
        ad.offerLast(20);// This will also add the element in last of the array
        System.out.println("ArrayDeque elements:"+ad);
        ad.offer(30);
        System.out.println(ad);
        // To add the element in the begining of the array List
        ad.offerFirst(100);
        System.out.println("Appending element in front"+ad);
        // peek element(gives front element)
        System.out.println("Peek element "+ad.peekFirst());// ad.peek() is also same
        // peek element at the last
        System.out.println(ad.peekLast());// from last it will give peek element
        // Same as remove ,element,poll and other function
    }
}
