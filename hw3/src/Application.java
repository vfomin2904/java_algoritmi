import tools.MyDeque;
import tools.MyStack;

public class Application {

    public static void main(String[] args) {
//        StringReverse stringReverse = new StringReverse("My string 123456780");
//        System.out.println(stringReverse.reverse());

        MyDeque<Integer> deque = new MyDeque<>(10);

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(60);
        deque.addFirst(70);
        deque.addFirst(80);
        deque.addFirst(90);
        deque.addFirst(100);
        deque.addFirst(110);
        deque.addFirst(7);
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(9);
        deque.addLast(10);
        deque.addLast(11);
        deque.addLast(12);
        deque.addLast(13);
        deque.addFirst(44);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque);

        deque.addLast(222);
        deque.addFirst(333);

        System.out.println(deque);


//        MyStack<Integer> stack = new MyStack<>(5);
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack);
//        stack.push(6);
//        System.out.println(stack);
    }
}
