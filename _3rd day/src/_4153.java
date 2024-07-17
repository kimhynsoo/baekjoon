import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class _4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        int [] n = new int[3];
        int max,max_seq;

        while(true){
            String [] input=buffer.readLine().split(" ");
            n[0]= Integer.parseInt(input[0]);
            n[1]= Integer.parseInt(input[1]);
            n[2]= Integer.parseInt(input[2]);

            max=n[0];
            max_seq=0;
            if(n[1]>n[0]){
                max=n[1];
                max_seq=1;
                if(n[2]>n[1]){
                    max=n[2];
                    max_seq=2;
                }
            }
            else if (n[2]>n[0]) {
                max=n[2];
                max_seq=2;

            }

            if(max==0)
                break;
            if(max_seq==0){
                if(Math.pow(n[0],2)==Math.pow(n[1],2)+Math.pow(n[2],2))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else if(max_seq==1){
                if(Math.pow(n[1],2)==Math.pow(n[0],2)+Math.pow(n[2],2))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else if(max_seq==2){
                if(Math.pow(n[2],2)==Math.pow(n[0],2)+Math.pow(n[1],2))
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }


        }
    }
}