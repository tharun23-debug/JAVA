package day08;

public class bubble_sort {
    public static void main(String[] args){
        int []arr={1,3,2,5,2,4,8,9,15,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
