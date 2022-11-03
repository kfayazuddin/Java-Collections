import java.util.Comparator;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();// Min heap
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        System.out.println("Element of pq :"+pq);
        int ans  = pq.remove(); // .poll()
        System.out.println("Min element in heap:"+ans);
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>(Comparator.reverseOrder());// Max Heap is implemented
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(40);
        maxHeap.add(50);
        maxHeap.add(60);
        System.out.println("max Heap:"+maxHeap);
        System.out.println("Max element in heap:"+" "+maxHeap.poll());// peek()
    }
}
