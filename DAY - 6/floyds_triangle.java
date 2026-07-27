package day06;

public class floyds_triangle {
    public static void main(String[] args){
        int n=5;
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%4d",c);
                c++;
            }
            System.out.println();
        }
    }
}
