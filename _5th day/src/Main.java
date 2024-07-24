import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n =  Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            list.add(Integer.parseInt(br.readLine()));

        }
        Collections.sort(list);

        //quickSort(input,0,input.length-1);
        //mergesort(input,0,input.length-1);
        for (Integer num : list){
            sb.append(num).append("\n");
        }

        System.out.println(sb);

    }
//    private static void quickSort(int []arr, int left, int right){
//        if(left<right){
//            int pivotIndex= partition(arr, left, right);
//            quickSort(arr, left,pivotIndex-1);
//            quickSort(arr,pivotIndex+1, right);
//        }
//    }
//
//    private static int partition(int []arr, int left, int right){
//        int pivot = arr[right];
//        int i = left -1;
//        for (int j= left; j<right; j++){
//            if(arr[j] <pivot){
//                i++;
//                swap(arr,i,j);
//            }
//        }
//
//        swap(arr,i+1,right);
//        return i+1;
//    }
//
//    private static void swap(int []arr, int i, int j){
//        int temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }

//    private static void mergesort(int [] arr, int left, int right){
//        if(left<right){
//            int mid = left+ (right-left) /2 ; //오버플로우 방지를 위해 이렇게 계산한다 (left+right) / 2가 아닌
//            mergesort(arr,left,mid);
//            mergesort(arr,mid+1,right);
//            merge(arr,left,mid,right);
//        }
//    }
//
//    private static void merge(int [] arr, int left, int mid, int right){
//        int i = left, j=mid +1;
//        int [] temp = new int[right - left +1];
//        int k =0 ;
//
//        while (i<=mid && j<=right){
//            if(arr[i]<=arr[j])
//                temp[k++]=arr[i++];
//            else
//                temp[k++]=arr[j++];
//        }
//
//        while(i<=mid){
//            temp[k++]=arr[i++];
//        }
//
//        while(j<=right){
//            temp[k++]=arr[j++];
//        }
//
//        for(i = left ; i<=right; i ++){
//            arr[i]=temp[i-left];
//        }
//    }

}