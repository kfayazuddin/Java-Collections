
import java.util.Map.Entry;

public class HashMap {
    public static void main(String[] args) {
        //java.util.HashMap<String,Integer> m = new  java.util.HashMap<String,Integer>();
        /*If we want to store data in sorted order, and sorting takes place on key */
        java.util.TreeMap<String,Integer> m = new  java.util.TreeMap<String,Integer>();// String are arrange daccording to Dictionary manner
        m.put("one",1);
        m.put("Two",2);
        m.put("Three",3);
        m.put("Four",4);
        m.put("Five",5);
        m.put("Six",6);
        // to insert any input only if  not present for that
        m.putIfAbsent("Seven", 7);
        m.remove("one");
        // When we add same key with different value again then it will get updated eg: m.put("Two",26)// so value of two will 26 no more 2
        for(Entry<String,Integer>map : m.entrySet())
        {  
            System.out.println(map);
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
        // To get only Keys
        for(String key: m.keySet())
        {
                System.out.println(key);
        }
        // To get only Value
        for(Integer v: m.values())
        {
                System.out.println(v);
        }
        // To check key is present or not
        System.out.println( m.containsKey("one"));// same for value just replace  by valuecontainsValue(value:)
        //
    }
}
