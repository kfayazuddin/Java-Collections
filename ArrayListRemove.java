import java.util.ArrayList;
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
       System.out.println(list);
       // to remove use .remove(index);
       list.remove(2);
       System.out.println(list);
       //removing element by passing element in parameter
       list.remove(Integer.valueOf(10));
       System.out.println(list);
       // to clear whole list 
       list.clear();
       System.out.println(list);
       
    }
}
