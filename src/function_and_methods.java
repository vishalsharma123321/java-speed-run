import java.util.*;
import java.math.*;
 class function_and_methods {

    //////////////// 1) Enter 3 numbers from the user & make a function to print their average.

//    public static void main(String[] args) {
//        System.out.print("first number = ");
//        Scanner sc = new Scanner(System.in);
//        int num1= sc.nextInt();
//        System.out.print("second  number = ");
//        int num2= sc.nextInt();
//        System.out.print("third number = ");
//        int num3= sc.nextInt();
//        average(num1 , num2 , num3 );
//    }
//    public static void average(int a , int b , int c ){
//        int Average = (a+b+c)/3;
//        System.out.println(Average);
//    }


//    2) Write a function to print the sum of all odd numbers from 1 to n.

//    public static void main(String[] args) {
//    Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the value of n to get the sum of odd number till n = ");
//        int n = sc.nextInt();
//        odd(n);
//    }
//
//    public static void odd(int n ) {
//        int sum=0;
//        for (int i=1 ; i<=n ; i++){
//            if (i%2==1){
//                sum=sum+i;
//            }
//
//        }
//        System.out.println(sum);
//    }


// 3)  Write a function which takes in 2 numbers and returns the greater of those two.

//    public static void main(String[] args) {
//        Scanner sc =new Scanner (System.in);
//        System.out.print("Enter the first number = ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the second number  = ");
//        int num2 = sc.nextInt();
//        greater(num1 , num2 );
//    }
//
//    public static void greater(int a ,int b) {
//        if (a>b){
//            System.out.println(a);
//        }else {
//            System.out.println(b);
//        }
//
//    }


    // 4) Write a function that takes in the radius as input and returns the circumference of a circle.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius of the circle = ");
//        int radius = sc.nextInt();
//        circumference(radius);
//    }
//
//    public static double circumference(int a) {
//        double pie = 3.14;
//        double cir = 2 * (pie * a);
//        System.out.println(cir);
//        return cir;
//    }




//    Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int p=0 , n=0 ,z=0 ;
//        System.out.println("to stop writing the number write -1 :");
//        while (true){
//            int num=sc.nextInt();
//            if (num==-1){
//                break;
//            }else if(num>0){
//                p++;
//            }else if(num<0){
//                n++;
//            }else {
//                z++;
//            }
//        }
//        System.out.println("positive numbers are = "+ p);
//        System.out.println("negative numbers are = "+ p);
//        System.out.println("zeros are = "+ p);
//
//    }


//    Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the value of x = ");
//        int x = sc.nextInt();
//        System.out.print("enter the value of n which will become the power of x = ");
//        int n = sc.nextInt();
//        power(x,n);
//    }
//
//    public static void power(int a , int b) {
//        BigInteger pow = BigInteger.valueOf(a).pow(b);
//        System.out.println(pow);
//    }


    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}


