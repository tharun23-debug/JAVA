package day05;

import java.util.Scanner;

public class function {
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int s=k.nextInt();
        int l=k.nextInt();
//        int c=add(s,l);
//        System.out.println(c);

//        add1();


    }
    //with parameter and with return type

    public static int  add(int a, int b){
        return(a+b);
    }

    //without parameter and without return type

    public static void add1(){
        System.out.println("Hello");
    }

    //with parameter and without return type

    public static void add2(){
//        System.out.println(a+b);
    }
    //without parameter and with return type

    public static int add3(){
        return 1;
    }
}
