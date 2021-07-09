import lesson4.MyLinkedList;
import lesson4.MyLinkedStack;

public class Application {
    public static void main(String[] args) {
        MyLinkedStack<Integer> stack = new MyLinkedStack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.insertLast(1);
        list.insertLast(2);
        list.insertFirst(3);
        list.insertLast(4);
        list.insertFirst(5);
        list.removeFirst();

        list.forEach(x -> System.out.println(x));
    }
}
