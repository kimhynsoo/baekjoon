import java.util.Scanner;
import java.lang.Math;
public class _2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = (int) ((Math.pow(num1,2)+Math.pow(num2,2)+Math.pow(num3,2)+Math.pow(num4,2)+Math.pow(num5,2))%10);
        System.out.println(num6);

    }
}