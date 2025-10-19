import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = 1 - sc.nextInt();
        int queen = 1 - sc.nextInt();
        int look = 2 - sc.nextInt();
        int bishop = 2 - sc.nextInt();
        int Knight = 2 - sc.nextInt();
        int phone = 8 - sc.nextInt();
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(Knight + " ");
        System.out.println(phone + " ");
    }
}