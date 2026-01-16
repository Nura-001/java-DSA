import java.util.*;

/*
 * This program demonstrates:
 * LinkedList, PriorityQueue, Deque,
 * HashMap, TreeMap, and HashSet
 * in a single execution.
 */
public class JavaCollectionComparisonDemo {

    public static void main(String[] args) {

        // ================= LINKED LIST =================
        System.out.println("---- LinkedList ----");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(30);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(15);
        System.out.println(linkedList); // Maintains insertion order

        // ================= PRIORITY QUEUE =================
        System.out.println("\n---- PriorityQueue ----");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(15);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Sorted order
        }

        // ================= DEQUE =================
        System.out.println("\n\n---- Deque ----");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);
        System.out.println(deque); // Both ends insertion

        // ================= HASH MAP =================
        System.out.println("\n---- HashMap ----");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        System.out.println(hashMap); // No order

        // ================= TREE MAP =================
        System.out.println("\n---- TreeMap ----");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println(treeMap); // Sorted by key

        // ================= HASH SET =================
        System.out.println("\n---- HashSet ----");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // duplicate ignored
        hashSet.add(30);
        System.out.println(hashSet); // Unique values only
    }
}
