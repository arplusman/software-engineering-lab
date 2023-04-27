import java.sql.SQLOutput;
import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String lines;
        int i = n;
        while (i >= 0) {
            lines = "";
            for (int j = 0; j < 2 * n + m; j++) {
                if (j < i || 2 * n + m - j <= i)
                    lines = lines + ' ';
                else
                    lines = lines + '*';
            }
            for(int a = 1; a <= k; a++)
                System.out.print(lines);
            System.out.print("\n");
            i--;
        }
        i += 2;
        while (i <= n){
            lines = "";
            for (int j = 0; j < 2 * n + m; j++) {
                if (j < i || 2 * n + m - j <= i)
                    lines = lines + ' ';
                else
                    lines = lines + '*';
            }
            for(int a = 1; a <= k; a++)
                System.out.print(lines);
            System.out.print("\n");
            i++;
        }
    }
}

