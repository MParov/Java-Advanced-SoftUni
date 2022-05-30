import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < command[0]; i++) {
            queue.offer(line[i]);
        }
        for (int i = 0; i < command[1]; i++) {
            queue.pop();
        }
        for (int i = 0; i < queue.size(); i++) {
            int currentNumber = queue.pop();
            if (currentNumber == command[2]) {
                System.out.println("true");
            } else if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
