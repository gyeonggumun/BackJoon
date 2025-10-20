import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((i-1) * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}