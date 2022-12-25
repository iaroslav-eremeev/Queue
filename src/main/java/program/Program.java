package program;

import model.Queue;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();
        System.out.println("Enter 3 strings for a new queue");
        queue.put(scanner.next());
        queue.put(scanner.next());
        queue.put(scanner.next());
        System.out.println(queue);
        System.out.println("Now we use get on queue. See what changed");
        queue.get();
        System.out.println(queue);
    }
}
