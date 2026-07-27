package day08;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args){
        Scanner k =new Scanner(System.in);
        int n=k.nextInt();
        int []arr=new int[n];
        int target=k.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=k.nextInt();
        }
        System.out.println(linear_search(arr, target));
    }
    public static int linear_search(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
