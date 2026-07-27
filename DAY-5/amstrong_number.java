package day05;

import java.util.Scanner;

public class amstrong_number {
    public static void main(String[] args){

        Scanner h= new Scanner(System.in);

        int s=h.nextInt();
        int o=s;
        int sum=0;
        while(s!=0){
            int pop=s%10;
            sum+=pop*pop*pop;
            s/=10;
        }
        if(sum==o){
            System.out.println("Is a Amstrong Number");
        }
        else{
            System.out.println("Is Not a Armstrong Number");
        }
    }
}
