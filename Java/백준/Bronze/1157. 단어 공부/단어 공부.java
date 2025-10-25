import java.util.Scanner;

public class Main {
    //알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이
    //무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 26개 받을 배열 생성
        String str = sc.nextLine();
        int max = -1;
        char duplication = 'a';
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자 범위 체크
                arr[str.charAt(i) - 'A']++;
            } else {                                       // 소문자 범위 체크
                arr[str.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                duplication = (char)(i + 65);  // 대문자로 출력해야 함으로 65 더해줌
            } else if (arr[i] == max) {
                duplication = '?';
            }
        }
        System.out.println(duplication);
    }
}