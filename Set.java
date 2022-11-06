public class Set {
    public static void main(String[] args) {
        java.util.Set<Integer> st = new java.util.HashSet<Integer>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);
        st.add(60);
        System.out.println("Generic set "+st);
        /*Hashset Randomly it stores value but which are unique ,duplicate elements are not stored
        (It is basically used when we need elements to be store uniquely)*/
        st.remove(50);
        System.out.println(st);
        st.add(60);// only 1 time 60  we will get
        System.out.println(st);
        System.out.println(st.contains(20));// Gives answer in boolean form
        System.out.println(st.size());
        /*If i want to store the data in same order as what we are giving through add function 
         * Here we required LinkedHashSet to do that
        */
        java.util.Set<Integer> m = new java.util.LinkedHashSet<Integer>();
        m.add(10);
        m.add(2);
        m.add(30);
        m.add(40);
        m.add(5);
        System.out.println("LinkedHashSet output"+m);
        m.remove(30);
        System.out.println(m);
        m.add(60);// only 1 time 60  we will get
        System.out.println(m);
        System.out.println(m.contains(20));
    /*If we want to sorted the data in storted form 
     * Then we will use TreeSet
     * It actually uses heap implementation
    */
    java.util.Set<Integer> t = new java.util.TreeSet<Integer>();
    t.add(10);
    t.add(2);
    t.add(70);
    t.add(40);
    t.add(5); 
    System.out.println("TreeSet output"+t);
    t.remove(30);
    System.out.println(t);
    t.add(60);// only 1 time 60  we will get
    System.out.println(t);
    System.out.println(t.contains(20));
    }
}
