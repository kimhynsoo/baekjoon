import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1259 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String [] input = br.readLine().split("");
            if (input[0].equals("0") && input.length==1)
            {
                break;
            }

            int [] num = new int[input.length];
            for(int i=0; i< input.length; i++)
            {
                num[i]=Integer.parseInt(input[i]);
            }
            int j =input.length-1;
            if(input.length==1)
                System.out.println("yes");
            for (int i=0; i<input.length/2; i++)
            {
                if(j-i<=2 && num[i]==num[j])
                {
                    System.out.println("yes");
                    break;
                }
                if((num[i]!=num[j]))
                {
                    System.out.println("no");
                    break;
                }

                j--;



            }



        }



    }






}