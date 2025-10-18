import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        // for 문을 돌리기 위한 변수 생성
        int strLength = str.length();
        // 모든 문자열을 확인하기 위한 for문
        for (int i = 0; i < strLength; i++) {
            // str안에 있는 문자열을 하나씩 확인하여 count에 합쳐 더해주는 작업
            switch (str.charAt(i)) {
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;
                case 'D': case 'E': case'F':
                    count += 4;
                    break;
                case 'G': case 'H': case 'I':
                    count += 5;
                    break;
                case  'J': case 'K': case 'L':
                    count += 6;
                    break;
                case  'M': case 'N': case 'O':
                    count += 7;
                    break;
                case 'P': case 'Q': case'R': case 'S':
                    count += 8;
                    break;
                case 'T': case 'U': case 'V':
                    count += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}