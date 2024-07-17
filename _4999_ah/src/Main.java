import java.util.*;
import java.lang.String;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1=scan.next();
        String str2=scan.next();

        if(str1.length()>=str2.length())
            System.out.println("go");
        else
            System.out.println("no");

    }
}

