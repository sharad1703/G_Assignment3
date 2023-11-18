import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // Question A
        int[][] t = new int[2][3];

        // Question B
        System.out.println("Number of rows in t: " + t.length);

        // Question C
        System.out.println("Number of columns in t: " + t[0].length);

        // Question D
        System.out.println("Number of elements in t: " + (t.length * t[0].length));

        // Question E
        System.out.print("Elements in row 1 of t: ");
        for (int j = 0; j < t[0].length; j++) {
            System.out.print(t[1][j] + " ");
        }
        System.out.println();

        // Question F
        System.out.print("Elements in column 2 of t: ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i][1] + " ");
        }
        System.out.println();

        // Question G
        t[0][1] = 0;

        // Question H
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = 0;
            }
        }

        // 1
        for (int[] row : t) {
            for (int i = 0; i < row.length; i++) {
                row[i] = 0;
            }
        }

        // Question J
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values for the elements of t:");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = scanner.nextInt();
            }
        }

        // Question K
        int smallestValue = Integer.MAX_VALUE;
        for (int[] row : t) {
            for (int value : row) {
                if (value < smallestValue) {
                    smallestValue = value;
                }
            }
        }
        System.out.println("Smallest value in t: " + smallestValue);

        // Question L
        System.out.printf("Elements of the first row of t: %d %d %d%n", t[0][0], t[0][1], t[0][2]);

        // Question M
        int columnTotal = t[0][2] + t[1][2];
        System.out.println("Total of elements in the third column of t: " + columnTotal);

        // Question N
        System.out.println("Contents of t in tabular format:");
        System.out.printf("%-8s%-8s%-8s%n", "Column 0", "Column 1", "Column 2");
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Row %d:   %-8d%-8d%-8d%n", i, t[i][0], t[i][1], t[i][2]);
        }

        scanner.close();
    }
}

