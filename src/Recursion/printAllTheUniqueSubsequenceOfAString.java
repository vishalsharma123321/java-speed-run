package Recursion;
import java.util.HashSet;
public class printAllTheUniqueSubsequenceOfAString {
    static void recursion(String str , String newstr , int index,HashSet<String> set){
        if (index==str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currentchar=str.charAt(index);

        recursion(str,newstr+currentchar,index+1,set);

        recursion(str,newstr,index+1,set);
    }



    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        recursion(str,"",0,set);
    }
}
