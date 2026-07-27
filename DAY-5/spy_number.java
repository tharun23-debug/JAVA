package day05;

import java.util.Scanner;

public class spy_number {
    public static void main(String[] args){
        Scanner j=new Scanner(System.in);

        int a=j.nextInt();
        int sum=0;
        int product=1;

        while(a!=0){
            int pop=a%10;
            sum+=pop;
            product*=pop;
            a/=10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }

    }
}
