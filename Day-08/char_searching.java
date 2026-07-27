package day08;

public class char_searching {
    public static void main(String[] args){
        String name="hello world";
        char[] name1=name.toCharArray();
        char target='d';
        if(ls(name1, target)){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
    public static boolean ls(char[]name1,char target){
        for(char name:name1){
            if(name==target){
                return true;
            }
        }
        return false;
    }
}
