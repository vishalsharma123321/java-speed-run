package Recursion;

public class StringReverse {

    public static void Stringrev(String str,int index){
        if (index<0){
            return;
        }
        System.out.println(str.charAt(index));
        Stringrev(str,index-1);
    }

    public static void main(String[] args) {
        String str= "vishal";
        int index=str.length();
        Stringrev(str,index-1);
    }
}
