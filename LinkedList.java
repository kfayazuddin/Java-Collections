
public class LinkedList {
    public static void main(String[] args)
    {
      java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println(list);   
      // Remove the list
      list.remove();
      System.out.println(list); 
      // removing at specified position
      System.out.println(list.remove(2));
      System.out.println(list);
      // removing element 
      System.out.println(list.remove(Integer.valueOf(30)));
      System.out.println(list);
    }
}
