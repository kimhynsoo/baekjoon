import java.util.Scanner;
public class _2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i=0; i<a ; i++)
        {
            int b = sc.nextInt();
            String str= sc.next();
            for (int j=0; j<str.length(); j++)
            {
                for(int k=0; k<b; k++)
                {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print("\n");

        }
    }
}