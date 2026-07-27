package day07;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);
        int []a={1,2,3,4,5,6,7,8,9,10};
        int evensum=0;
        int oddsum=0;
        for(int k:a){
            if(k%2==0){
                evensum+=k;
            }
            else {
                oddsum += k;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
