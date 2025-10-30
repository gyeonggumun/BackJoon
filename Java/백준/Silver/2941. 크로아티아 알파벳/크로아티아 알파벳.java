import java.util.Scanner;

public class Main {
    //알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이
    //무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for (int i= 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'c') {
                if (i < str.length() - 1) {        // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            if (ch == 'd') {
                if (i < str.length() - 1) {        // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {      // str의 크기를 넘어가지 않도록 검사
                            if (str.charAt(i + 2) == '=') {
                                i = i + 2;
                            }
                        }
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            if (ch == 'l') {
                if (i < str.length() - 1) {         // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            if (ch == 'n') {
                if (i < str.length() - 1) {            // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            if(ch == 's') {
                if (i < str.length() - 1) {           // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            if (ch == 'z') {
                if (i < str.length() - 1) {            // str의 크기를 넘어가지 않도록 검사
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            count += 1;
        }
        System.out.println(count);
    }
}