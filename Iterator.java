import java.util.ArrayList;
public class Iterator {
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
         // to iterate over ArrayList
         for(int i =0;i<list.size();i++)
         {
            // method 1: using .get(index);
            System.out.print(list.get(i)+" ");
         }
         System.out.println();
         // method 2: using foreach loop
         for(Integer element :list)
         {
            System.out.print(element+" ");
         }
         System.out.println();
         // method 2: using iterator
         java.util.Iterator<Integer> it = list.iterator();
         while(it.hasNext())
         {
            System.out.print(it.next()+" ");
         }
         System.out.println();

    }

}
