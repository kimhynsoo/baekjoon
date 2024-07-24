import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11050 { //이항계수 구하기 (조합)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        System.out.println(bc2(num1,num2));


    }
    static int factorial(int a){
        int fac=1;
        for (int i=1; i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }

    static int bc(int a, int b){ //이항계수 Binomial Coefficient
        int c= a-b;
        return factorial(a)/(factorial(b)*factorial(c));

    }

    static int bc2(int n, int k){//재귀 recursive
        if(k==0 || k==n)
            return 1;

        return bc2(n-1,k-1)+bc2(n-1,k);

    }
}