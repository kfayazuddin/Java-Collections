import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        // Here on array primative data type we can do operations
       int arr[] = {2,30,4,8,2,56,7,5,65,20};
       for(int ele :arr)
       {
        System.out.print(ele+" ");
       }
       System.out.println();
       
       Arrays.sort(arr);
       System.out.println("Sorted list:");
       for(int ele :arr)
       {
        System.out.print(ele+" ");
       }
       System.out.println();
       /*For BinarySearch
        * Note: It can we done only on sorted array
         */
       int index = Arrays.binarySearch(arr, 56);
       System.out.println(index);
       // To fill all nindex with same number
       Arrays.fill(arr, -1);
       for(int ele :arr)
       {
        System.out.print(ele+" ");
       }
    }
}
