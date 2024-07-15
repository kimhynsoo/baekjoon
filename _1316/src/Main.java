
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=n;

        for(int i=0; i < n ; i++)
        {
            String str = sc.next();
            boolean check[]= new boolean[26]; //default value is 'false'
            char prev = 0;
            for(int j=0; j < str.length(); j++)
            {
                if(j==0){
                    check[str.charAt(j)-'a']=true;
                    prev=str.charAt(j);
                }
                else{
                    if(str.charAt(j)!=prev) {
                        if (check[str.charAt(j) - 'a']) {
                            count--;
                            break;
                        } else {
                            check[str.charAt(j) - 'a'] = true;
                            prev = str.charAt(j);
                        }
                    }
                }
            }
        }
        System.out.println(count);




    }
}