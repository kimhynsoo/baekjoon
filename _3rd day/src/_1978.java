//소수찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt=0;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for ( int i=0; i<n; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)==true)
                cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for (int i=2; i*i<=n ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

