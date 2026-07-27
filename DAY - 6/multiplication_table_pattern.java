package day06;

public class multiplication_table_pattern {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.printf("%5d",i*j);
            }
            System.out.println();
        }
    }

}
