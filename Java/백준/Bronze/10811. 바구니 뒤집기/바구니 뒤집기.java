import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] basket = new int[n];
            for (int i = 0; i < n; i++) {
                basket[i] = i + 1;
            }
            int temp = 0;
            for (int i = 0; i < m; i++) {
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt() - 1;
                while (x < y) {
                    temp = basket[x];
                    basket[x] = basket[y];
                    basket[y] = temp;
                    x++;
                    y--;
                }
            }
            for(int i = 0; i < basket.length; i++) {
                System.out.print(basket[i] + " ");
            }

        }
    }