package day05;

import java.util.Scanner;

public class Remove_All_Zero_Digits {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int a = k.nextInt();

        int result = 0;
        int place = 1;

        while (a != 0) {
            int digit = a % 10;

            if (digit != 0) {
                result = result + digit * place;
                place *= 10;
            }

            a /= 10;
        }

        System.out.println(result);
    }
}
