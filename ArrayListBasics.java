import java.util.ArrayList;
/**
 * ArrayListBasics
 */
public class ArrayListBasics {

    public static void main(String[] args) 
    {
      ArrayList<Integer> list = new ArrayList<Integer>();
     // add append the element at the end of arrayList (list)
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       list.add(60);
      System.out.println(list);
      // to add any element at specified postion in arrayList .add(index,element)
      list.add(2,100);
      System.out.println(list); 
      // We can you set as well  to update the value 
      list.set(3,300);
      System.out.println(list);
      // to append any other whole arrayList in list
      ArrayList<Integer> newlist = new ArrayList<Integer>();
      newlist.add(500);
      newlist.add(1000);
      // appending newlist into list
      list.addAll(newlist);
      System.out.println(list);
      // to check element is present or not
        System.out.println(list.contains(50));// print boolean
    }
}
