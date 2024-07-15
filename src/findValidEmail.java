import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class findValidEmail {
    public static void main(String[] args) {
        String email = "example@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()){
            System.out.println(email+" is a vaild email");
        }else {
            System.out.println(email+" is not avalid email");
        }
    }
}
