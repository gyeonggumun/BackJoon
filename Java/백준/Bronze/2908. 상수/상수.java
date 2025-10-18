import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // int 자료형 StringBuilder를 통해 문자열로 변경하여 뒤집어 주고 Int 자료형으로 다시 변환
        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
        // A와 B를 비교하여 A가 크면 A를 A가 작으면 B를 출력
        System.out.println(A > B ? A : B);

    }
}