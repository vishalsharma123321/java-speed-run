import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in );
        StringBuilder sb = new StringBuilder("vishalSharma");
        int l=sb.length();
        sb.delete(0,3);
        sb.append(" bad boy"); /// apppend is used to add another word with the excisting one .
        sb.insert(0,"vis");
        sb.insert(6," ");
        sb.replace(14,17,"good");
        sb.reverse();

        System.out.println((sb.capacity()));


        System.out.println(l);
        System.out.println(sb);
    }
}
