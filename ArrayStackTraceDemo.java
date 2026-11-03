// This example requires the ArrayStack<T> class from the lecture.
public class ArrayStackTraceDemo {
    public static void main(String[] args) {
        // DEFAULT_CAPACITY = 2
        ArrayStack<String> s = new ArrayStack<>();

        s.push("A");
        s.push("B");

        // size? capacity?
        s.push("C");

        // size? capacity?
        System.out.println("peek: " + s.peek());
        System.out.println("pop:  " + s.pop());
        System.out.println("pop:  " + s.pop());
        System.out.println("pop:  " + s.pop());
        System.out.println("pop:  " + s.pop());
    }
}
