import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        StringTokenizer str2 = new StringTokenizer(str1, " ");
        System.out.println(str2.countTokens());
    }
}