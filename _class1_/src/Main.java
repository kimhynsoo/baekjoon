import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int numarr[] = new int[num];
        int total=0;
        String[] str = sc.next().split("");
        for (int i=0; i<num; i++){
            numarr[i] = Integer.parseInt(str[i]);
            total+=numarr[i];

        }
        System.out.print(total);

    }
}