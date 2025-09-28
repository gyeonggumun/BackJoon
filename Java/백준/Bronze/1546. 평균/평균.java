import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double sum = 0;
        double conclusion = 0;
        int num = scanner.nextInt();
        double[] nums = new double[num];
        for (int i = 0; i < nums.length; i++) {
            double n = scanner.nextDouble();
            nums[i] = n;
            max = nums[i] < max ? max : nums[i];
        }
        for (int i =0; i < nums.length; i++) {
            conclusion = nums[i] / max * 100.0;
            sum = conclusion + sum;
        }
        System.out.println(sum / num);
    }
}