import java.sql.SQLOutput;
import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        char[][] matrix = new char[2 * n + 1][2 * n + m];
        int i = n;
        int row = 0;
        while (i >= 0) {
            for (int j = 0; j < 2 * n + m; j++) {
                if (j < i || 2 * n + m - j <= i)
                    matrix[row][j] = ' ';
                else
                    matrix[row][j] = '*';
            }
            i--;
            row++;
        }
        i += 2;
        while (i <= n) {
            for (int j = 0; j < 2 * n + m; j++) {
                if (j < i || 2 * n + m - j <= i)
                    matrix[row][j] = ' ';
                else
                    matrix[row][j] = '*';
            }
            i++;
            row++;
        }
        for (int l = 0; l < 2 * n + 1; l++) {
            for (int a = 1; a <= k; a++) {
                for (int j = 0; j < 2 * n + m; j++) {
                    System.out.print(matrix[l][j]);
                }
            }
            System.out.print("\n");
        }
    }
}

