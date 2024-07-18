import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double [] score = new double[n];
        String [] str = br.readLine().split(" ");
        double max=0;
        for(int i=0; i<n; i++)
        {
            score[i]=Double.parseDouble(str[i]);
            if(score[i]>max)
                max=score[i];
        }
        for(int i=0; i<n; i++)
        {
            score[i]=score[i]/max*100;
        }
        double avg=0;
        for(int i=0; i<n; i++)
        {
            avg+=score[i];
        }
        avg=avg/n;
        System.out.println(avg);



    }






}