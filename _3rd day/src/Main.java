//소수찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine());
        String [] str=new String[n];
        for (int i=0; i<n; i++)
        {
            str[i]= bf.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length()-o2.length();
            }
        });

        for (int i=0; i<n; i++)
        {
            if(i!=n-1 && !str[i].equals(str[i+1]))
                System.out.println(str[i]);
            if(i==n-1)
                System.out.println(str[i]);
        }



    }
}

