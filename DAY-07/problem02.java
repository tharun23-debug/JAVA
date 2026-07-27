package day07;

public class problem02 {
    public static void main(String[]args){
        int []a={-5,2,3,4,5,6,7,8,9,10};
        int max=a[0];
        int min=a[0];
        for(int i:a){
            if(i>max){
                max=i ;
            }
           if(i<min){
               min=i;
           }
        }
        int c=max*min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(c);
    }
}
