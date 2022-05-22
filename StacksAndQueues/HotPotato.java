import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split("\\s+");
        int round = Integer.valueOf(scanner.nextLine());
        ArrayDeque<String> playersQueue = new ArrayDeque<>();

        for (int i = 0; i < players.length; i++) {
            playersQueue.offer(players[i]);
        }
        int counter = 1;
        while (playersQueue.size() > 1) {
            if (counter == round) {
                System.out.println("Removed " + playersQueue.poll());
                counter = 1;
            }else{
                counter++;
                playersQueue.offer(playersQueue.poll());
            }
        }
        System.out.println("Last is " + playersQueue.poll());
    }
}
