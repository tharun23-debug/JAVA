package day08;

public class bubble_sorting_using_function {
    public static void main(String[] args){
        int []arr={1,3,2,5,2,4,8,9,15,10};
        bubble_sorting(arr);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
    public static void bubble_sorting(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
             if(a[j]<a[i]){
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }

            }
        }

    }
}
