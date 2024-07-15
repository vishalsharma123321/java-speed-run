package Recursion;

public class printKeypadCombination {
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void recursion(String str , int index ,String combinations){
        if (index==str.length()){
            System.out.println(combinations); // dg , dh ,di
            return;
        }
        char currentchar=str.charAt(index); // 2 3
        String mapping = keypad[currentchar-'0'];//def ghi
        for (int i=0;i<mapping.length() ;i++ ){
            recursion(str,index+1,combinations+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="23";
        recursion(str,0,"");
    }
}
