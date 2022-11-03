public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
        // offer function add the elements in Queue and dont throw exception
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        System.out.println(q);
        // add function also adds the elements but it throws exception
        q.add(70);
        System.out.println(q);
        // to get the front element
       q.peek();
       System.out.println("Front element"+" "+q.peek());
       // element() function this will also give peek ele but throws exception
       q.element();
       System.out.println(q.element());
       //to remove element
       int ans = q.poll();
       System.out.println("Remove front element"+" "+ans);
       // to remove() 
       System.out.println(q.remove());
       System.out.println(q);
    }
}
