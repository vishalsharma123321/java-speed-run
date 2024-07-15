package Recursion;

public class printAllPermutationsOfAsString {
    static void recursion(String str , String combinations){
        if (str.length() == 0 ){
            System.out.println(combinations);
            return;
        }
        for (int i=0;i<str.length();i++ ){
            char currentchar = str.charAt(i); // c
            String newstring = str.substring(0,i)+str.substring(i+1); //
            recursion(newstring , combinations + currentchar);  //abc
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        recursion(str,"");
    }
}
