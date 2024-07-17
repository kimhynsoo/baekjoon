import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class _30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int cnt_people= sc.nextInt();
        int [] n = new int[6] ;
        for(int i=0; i<6; i++)
        {
            n[i]=sc.nextInt();

        }
        int set_shirt= sc.nextInt();
        int set_pen= sc.nextInt();

        int cnt_shirt=0;
        int cnt_pen;

        for(int i=0; i<6; i++)
        {
            if(n[i]/set_shirt==0)
            {
                if(n[i]!=0)
                    cnt_shirt++;
            }
            else
            {
                if(n[i] % set_shirt == 0)
                    cnt_shirt += (n[i] / set_shirt);
                else
                    cnt_shirt += (n[i] / set_shirt)+1;
            }
        }
        System.out.printf("%d\n",cnt_shirt);
        System.out.printf("%d %d",cnt_people/set_pen,cnt_people%set_pen);
    }
}