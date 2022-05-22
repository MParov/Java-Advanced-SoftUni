import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        ArrayDeque<String> lineStack = new ArrayDeque<>();

        for (int i = 0; i < line.length; i++) {
            lineStack.push(line[i]);
        }
        for (String s : lineStack) {
            System.out.print(lineStack.pop()+" ");
        }
    }
}
