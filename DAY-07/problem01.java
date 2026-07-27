package day07;

public class problem01 {
    public static void main(String[] args){
        int []a={1,2,3,4,5,6,7,8,9,10};
        int length=a.length;
        int sum=0;

        for(int num:a){
            sum+=num;
        }
        float avg=(float)sum/length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
