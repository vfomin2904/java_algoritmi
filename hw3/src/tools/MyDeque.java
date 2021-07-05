package tools;

import java.util.Arrays;

public class MyDeque<T> {

    private T[] list;
    private int start;
    private int end;
    private int size;
    private int capacity;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        this.capacity = capacity;
        this.start = capacity / 2;
        this.end = start + 1;
        list = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T el) {
        if (start < 0) {
            int newCapacity = (int) (capacity * 1.5);
            T[] arr = (T[]) new Object[newCapacity];
            System.arraycopy(list, 0, arr, newCapacity - capacity, capacity);
            list = arr;
            start = newCapacity - capacity - 1;
            end = start + size + 1;
            reCapacity(newCapacity);
        }
        list[start--] = el;
        size++;
    }

    public void addLast(T el) {
        if (end >= capacity) {
            int newCapacity = (int) (capacity * 1.5);
            T[] arr = (T[]) new Object[newCapacity];
            System.arraycopy(list, 0, arr, 0, capacity);
            list = arr;
            reCapacity(newCapacity);
        }
        list[end++] = el;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }
        T el = list[++start];
        list[start] = null;
        size--;
        return el;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is empty");
        }

        T el = list[--end];
        list[end] = null;
        size--;
        return el;
    }

    private void reCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "list=" + Arrays.toString(list);
    }
}
