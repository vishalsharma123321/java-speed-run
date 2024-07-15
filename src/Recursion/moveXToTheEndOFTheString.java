package Recursion;

public class moveXToTheEndOFTheString {
    public static void xToEnd(String str , int index,int count , String newstring ){
        if (index>str.length()-1){
            for (int i=0 ; i<count ;i++){
                newstring+='x';
            }
            System.out.println(newstring);;
        return;}

        char Char = str.charAt(index);
        if (Char=='x'){
            count+=1;
            xToEnd(str,index+1,count,newstring);
        }else {
            newstring+=Char;
            xToEnd(str,index+1,count,newstring);
        }
    }

    public static void main(String[] args) {
    String str="axbcxxd";
    xToEnd(str,0,0,"");
    }
}
