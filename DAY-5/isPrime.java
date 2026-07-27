package day05;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);

        int j=k.nextInt();
        if(j%2==1){
            System.out.println(j+" is Prime");
        }
        else{
            System.out.println(j+" is not prime");
        }
    }
}
