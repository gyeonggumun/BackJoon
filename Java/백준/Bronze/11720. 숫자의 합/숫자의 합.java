import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        String number = sc.next();
        for (int i = 0; i < num; i++) {
            // char()함수를 사용하면 아스키코드 값이 나오기 때문에 -48 or -'0'을 사용해야 입력값을 그대로 받아 올 수 있음
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}