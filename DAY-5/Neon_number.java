package day05;

import java.util.Scanner;

public class Neon_number {
    public static void main(String[] args){
        Scanner f=new Scanner(System.in);
        int a=f.nextInt();
        int square=a*a;
        int c=0;
        while(square!=0){
            int pop=square%10;
            c+=pop;
            square/=10;
        }
        if(c==a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
