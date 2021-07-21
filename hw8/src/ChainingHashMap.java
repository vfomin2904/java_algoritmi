
import java.util.LinkedList;

public class ChainingHashMap<K, V> {
    private int capacity;
    private int size;
    private final int DEFAULT_CAPACITY = 16;

    private LinkedList<Node>[] st;

    public ChainingHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        st = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            st[i] = new LinkedList<>();
        }
    }

    public ChainingHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        st = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public boolean contains(K key){
        return get(key) != null;
    }

    private void checkKeyNotNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key == null");
        }
    }

    public void put(K key, V value){
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if(key.equals(node.key)){
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key, value));
        size++;
    }

    public V get(K key){
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if(key.equals(node.key)){
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key){
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node node : st[i]) {
            if(key.equals(node.key)){
                V value = node.value;
                st[i].remove(node);
                return value;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node node : st[i]) {
                sb.append(node.key).append(" ");
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
