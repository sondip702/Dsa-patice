import java.util.*;
public class Deque_name {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.print(deque);
        deque.removeLast();
        System.out.print(deque);

    }
}
