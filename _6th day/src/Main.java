import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] inputs = new int[n][2];


        for(int i=0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            inputs[i][0]=Integer.parseInt(st.nextToken());
            inputs[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputs,(a,b)->{
            if(a[0]!=b[0]) {
                return a[0] - b[0];
            }
            else {
                return a[1] - b[1];
            }
        });



        for (int [] input : inputs){
            System.out.println(input[0] + " " + input[1]);
        }


    }
}




