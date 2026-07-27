package day05;

import java.util.Scanner;

public class even_sum_and_odd_sum {
    public static void main(String[]args){
        Scanner f=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a=f.nextInt();
        int sum=0;
        int evensum=0;
        int oddsum=0;

        while(a!=0){
            int p=a%10;
            if(p%2==0){
                evensum+=p;
            }
            else{
                oddsum+=p;
            }
            sum+=p;
            a/=10;
        }
        System.out.println("Total sum of the given number: "+sum);
        System.out.println("Even sum of the given number: "+evensum);
        System.out.println("Odd sum of the given number: "+oddsum);
    }
}
