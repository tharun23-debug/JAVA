package day06;

public class left_side_align_triangular {
    public static void main(String[] args){

        int a=5;
        for (int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
