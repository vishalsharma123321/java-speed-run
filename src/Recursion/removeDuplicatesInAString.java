package Recursion;

public class removeDuplicatesInAString {
    static boolean [] map = new boolean[26];

    static String recursion(String str , String newstr , int index){
        if (index==str.length()){
            return newstr;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar-'a']==true){
            return recursion(str,newstr,index +1);
        }else{
            newstr+=currentChar;
            map[currentChar-'a']=true;
            return recursion(str ,newstr , index+1);
        }
    }


    public static void main(String[] args) {
        String str = "abbccda";
        System.out.println(recursion(str,"",0));
    }
}
