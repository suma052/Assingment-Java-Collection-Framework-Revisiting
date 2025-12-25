import java.util.*;

public class MainProgram {

    static int kthSmallest(ArrayList<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1);
    }

    static void wordFrequency() {
        String text = "java is easy and java is powerful";
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String w : text.split(" ")) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        System.out.println(map);
    }

    static class StackPQ {
        static class E {
            int v, p;
            E(int v, int p) { this.v = v; this.p = p; }
        }
        int c = 0;
        PriorityQueue<E> pq = new PriorityQueue<>((a, b) -> b.p - a.p);
        void push(int x) { pq.add(new E(x, c++)); }
        int pop() { return pq.poll().v; }
    }

    static class QueuePQ {
        static class E {
            int v, p;
            E(int v, int p) { this.v = v; this.p = p; }
        }
        int c = 0;
        PriorityQueue<E> pq = new PriorityQueue<>((a, b) -> a.p - b.p);
        void enqueue(int x) { pq.add(new E(x, c++)); }
        int dequeue() { return pq.poll().v; }
    }

    static void studentTreeMap() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        System.out.println(map);
    }

    static void linkedListEqual() {
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        a.add(1); a.add(2);
        b.add(1); b.add(2);
        System.out.println(a.equals(b));
    }

    static void employeeHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "HR");
        map.put(2, "IT");
        map.put(3, "Finance");
        System.out.println(map);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 5, 8, 20, 1));
        System.out.println(kthSmallest(list, 3));

        wordFrequency();

        StackPQ s = new StackPQ();
        s.push(10); s.push(20); s.push(30);
        System.out.println(s.pop());

        QueuePQ q = new QueuePQ();
        q.enqueue(10); q.enqueue(20); q.enqueue(30);
        System.out.println(q.dequeue());

        studentTreeMap();
        linkedListEqual();
        employeeHashMap();
    }
}
