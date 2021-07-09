package lesson4;

public class MyLinkedStack <E>{
    private MyLinkedList<E> stack;
    private int size;

    public MyLinkedStack(){
        stack = new MyLinkedList<E>();
    }

    public void push(E item){
        stack.insertLast(item);
        size++;
    }

    public E pop(){
        E el = peek();
        stack.removeLast();
        return el;
    }

    public E peek(){
        return stack.getLast();
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "stack=" + stack +
                '}';
    }
}
