import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");

        int n = Integer.parseInt(command[0]);
        String type = command[1];
        int[][] matrix = new int[n][n];
        int counter = 1;
        if (type.equals("A")) {
            normalMatrix(matrix, counter);
        } else if (type.equals("B")) {
            reversedMatrix(matrix, counter);
        }
        printMatrix(matrix, n);
    }

    public static void normalMatrix(int[][] matrix, int counter) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[col][row] = counter;
                counter++;
            }
        }
    }

    public static void reversedMatrix(int[][] matrix, int counter) {
        int column = 1;
        for (int row = 0; row < matrix.length; row++) {
            if (column % 2 != 0) {
                column++;
                for (int col = 0; col < matrix.length; col++) {
                    matrix[col][row] = counter;
                    counter++;
                }
            } else {
                column++;
                for (int col = matrix.length - 1; col >= 0; col--) {
                    matrix[col][row] = counter;
                    counter++;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix, int n) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (col < matrix.length-1) {
                    System.out.print(matrix[row][col] + " ");
                } else {
                    System.out.print(matrix[row][col]);
                }
            }
            System.out.println();
        }
    }
}

