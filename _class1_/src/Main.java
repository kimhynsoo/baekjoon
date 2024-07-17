import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        int max_count=0;
        int a=0,b=0;
        for (int i=0; i<9; i++){
            a= sc.nextInt();
            if(a>b){
                b=a;
                max_count=count;
            }
            count++;


        }
        System.out.println(b);
        System.out.println(max_count);

    }
}