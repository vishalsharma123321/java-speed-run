package Recursion;

public class printAllSubsequencesOfAString {
    static void recursion(String str , String newstr , int index){
        if (index==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(index);

        recursion(str,newstr+currentchar,index+1);

        recursion(str,newstr,index+1);
    }
public static void main(String[] args) {
        String str="abc";
        recursion(str,"",0);
    }
}
