import java.util.Scanner;
public class _10818 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int num1= sc.nextInt();
        int min=0,max=0;
        for (int i=0; i < num1; i++){
            if(i==0){
                min=sc.nextInt();
                max=min;
            }
            else{
                int num2= sc.nextInt();
                if(num2<min)
                    min=num2;
                if(num2>max)
                    max=num2;
            }
        }
        System.out.printf("%d %d",min,max);
    }
}