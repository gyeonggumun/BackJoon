import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int num = sc.nextInt();
            String str1 = sc.next();
            for (int j = 0; j < str1.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(str1.charAt(j));
                }
            }
            System.out.println();
        }
    }
}