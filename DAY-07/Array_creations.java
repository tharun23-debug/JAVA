package day07;

import java.util.Scanner;

public class Array_creations {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[]a=new String[5];

        for(int i=0;i<5;i++){
            String g=k.next();
            a[i]=g;
        }
        for(String j:a){
            System.out.println(j);
        }

//        int[] a = {1,2,3,4,5,6};

//        for (int i=0;i<5;i++){
//            int j=k.nextInt();
//             a[i]=j;
//            System.out.println(a[3]);
//        }
//
//        for(int i=0;i<5;i++){
//            System.out.println(a[i]);
//        }
//        for(int num:a){//enasence for loop
//            System.out.println(num);
//        }

//        char []name={'H','s'};
//        for(char p:name){
//            System.out.println(p);
//        }

//        char []name={'H','s'};
//        for(int p:name){
//            System.out.println(p);
//        }
//        String []l={"Hari","Santh"};
//        for(String d:l){
//            System.out.println(d);
//        }

    }
}
