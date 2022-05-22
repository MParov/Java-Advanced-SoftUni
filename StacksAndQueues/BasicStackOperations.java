import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int numberOfElements = commands[0];
        int popElements = commands[1];
        int theNumber = commands[2];
        int min = Integer.MAX_VALUE;

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int number : numbers) {
            stack.push(number);
        }
        for (int i = 0; i < popElements; i++) {
            stack.pop();
        }
        boolean exist = stack.contains(theNumber);
        if (exist) {
            System.out.println("true");
        } else if (stack.size() < 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < stack.size(); i++) {
                int num = stack.pop();
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        }
    }
}
