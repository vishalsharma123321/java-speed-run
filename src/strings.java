import java.util.*;
public class strings {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);


            /////  1) Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
//            int size = sc.nextInt();
//            String [] arry = new String[size];
//            int length = 0;
//            for (int i=0 ; i<size ; i++){
//                arry[i]=sc.next();
//                length+=arry[i].length();
//            }
//        System.out.println(length);


/// 2)  Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original
// string with letter ‘i’.
//  Example :
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”


//        String name = sc.next();
//
//        String result = "";
//
//        for (int i = 0 ; i<name.length() ; i++){
//           if(name.charAt(i)=='e'){
//               result+='i';
//           }
//           else {
//               result+=name.charAt(i);
//           }
//        }
//
//        System.out.println(result);




//  3)  Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display
//  that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”


        String email= sc.next();
        String name="";
        for (int i=0 ; i<email.length() ; i++){
            if (email.charAt(i)=='@'){
                break;
            }else {
                name+=email.charAt(i);
            }
        }
        System.out.println(name);

        }

    }

