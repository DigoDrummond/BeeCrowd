import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class I_Can_Guess_the_Data_Structure {
    public static final String stack = "stack";
    public static final String queue = "queue";
    public static final String priorityQueue = "priority queue";
    public static final String impossible = "impossible";
    public static final String notSure = "not sure";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            boolean isStack = true;
            boolean isQueue = true;
            boolean isPriorityQueue = true;

            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                int comand = sc.nextInt();
                int value = sc.nextInt();

                if (comand == 1) {
                    stack.push(value);
                    queue.offer(value);
                    priorityQueue.offer(value);
                } else if (comand == 2) {
                    if (stack.pop() != value) {
                        isStack = false;
                    }
                    if (queue.poll() != value) {
                        isQueue = false;
                    }
                    if (priorityQueue.poll() != value) {
                        isPriorityQueue = false;
                    }
                }
            }
            if (!(isQueue || isStack || isPriorityQueue)) {
                System.out.println(impossible);
            } else if ((isStack && isQueue) || (isStack && isPriorityQueue) || (isQueue && isPriorityQueue)) {
                System.out.println(notSure);
            } else if (isStack) {
                System.out.println(stack);
            } else if (isQueue) {
                System.out.println(queue);
            } else {
                System.out.println(priorityQueue);
            }

        }

        sc.close();
    }
}
