import java.util.Scanner;

public class _2798 {
    static int max = 0;
    static int temp=0;

    static int M=0;

    public static void main(String[] args) {
        int[] arr ;

        int r = 3;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M=sc.nextInt();
        arr=new int[N];
        for (int i =0; i<N; i++)
        {
            arr[i]=sc.nextInt();
        }

        combi(arr, new int[r], new boolean[N], N, r, 0, 0);
        System.out.println(max);

    }

    public static void combi(int [] arr, int [] output, boolean [] visited, int n, int r, int start, int depth)
    {
        if(depth == r)
        {
            for (int i =0; i<r; i++)
            {
                temp+=output[i];

            }
            if(temp>max && temp<=M)
                max=temp;

            temp=0;
            return;

        }

        for (int i= start; i<n; i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                output[depth]=arr[i];
                combi(arr,output,visited,n,r,i+1,depth+1);
                visited[i]=false;
            }
        }



    }
}