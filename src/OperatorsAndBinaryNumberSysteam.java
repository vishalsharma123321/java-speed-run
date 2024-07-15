public class OperatorsAndBinaryNumberSysteam {
    public static void main(String[] args) {
        // pre increment
        // in the pre increment the value will get incremented first then it will get used or executed .
        // value change then value assign
        int a=10 ;
        int b=0;
        b=++a;
        System.out.println(a);
        System.out.println(b);
        // in this example you will notice that before assigning the value of a got increment and


        // post increment
        // in the post increment the value will get first used then value will be used .
        // value assign then value change 
        int v=10 ;
        int s=0;
        s=v++;
        System.out.println("s = "+ s);
        System.out.println("v = "+ v);
        // in this example you will notice that the v is used as 10 to assign in s then it got increment so its value becomes 11.

    }
}
