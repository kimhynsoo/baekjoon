import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2609 { //최대공약수 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
        System.out.println(gcd(num1,num2));
        System.out.println(lcm(num1,num2));


    }

    static int gcd(int a, int b){ //유클리드 호제법 최대공약수
        while (b != 0){
            int r = a % b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){ //LCM, least common multiple 최소공배수
        return a*b/gcd(a,b);

    }
}