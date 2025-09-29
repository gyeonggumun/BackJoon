import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt = cnt + 1;
        }
        System.out.println(cnt);
    }
}