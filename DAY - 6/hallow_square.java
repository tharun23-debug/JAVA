package day06;

public class hallow_square {
    public static void main(String[] args){
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==a|| j==a || i==1 || j==1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
