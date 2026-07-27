package day05;

import java.util.Scanner;

public class largest_value {
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        int a= g.nextInt();
        int large=0;
        while(a!=0){
            int p=a%10;
            if(large<p){
                large=p;
            }
            a/=10;
        }
        System.out.println(large);
    }
}
