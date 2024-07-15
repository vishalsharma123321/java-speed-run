//import java.util.*;
//class data_types{
//    public static void main(String[] args) {
////      int a=25;
////      int b=35;
////      int add=a+b;
////      System.out.println(add);
////
////      int c=43;
////      int d=56;
////      int diffrance=c-d;
////        System.out.println(diffrance);
////        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int sum = a + b ;
//        String v = sc.next();
//        char g = v.charAt(0);
//
////        System.out.println(sum);
//        System.out.println(v);
//        System.out.println(g);
//    }
//}



//import java.util.*;
//class data_types{
//    public static void main (String [] args ){
//        System.out.println(" Hi my name is vishal sharma ");
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter the value of a = ");
//        int a = sc.nextInt();
//        System.out.print("Enter the value for b = ");
//        int b = sc.nextInt();
//        int sum = a + b ;
//        System.out.println("The sum of a and b is = " + sum  );
//        String s = "hi my name is vishal ";
//        char v = s.charAt(3);
//        System.out.println(v);
//    }
//}

import java.util.*;
class data_types_with_pattern_qustions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//          int  button = sc.nextInt();

//        if (a>b) {
//            System.out.println("print a is greater than b ");
//        }
//        else if (a==b){
//                System.out.println("print a is equal to b ");
//            }
//        else{
//                System.out.println("b is greater than a ");
//            }
//
//        switch(button){
//            case 1 :
//                System.out.println("hello");
//                break;
//            case 2 :
//                System.out.println("Nameste");
//                break;
//            case 3:
//                System.out.println("Bounjour");
//                break;
//            default:
//                System.out.println("Invalid command !!!");
//
//        }
                  /////////////// calculator using switch
//        System.out.print("Enter the First number = ");
//        double a = sc.nextDouble();
//        System.out.print("Enter the Second number = ");
//        double b = sc.nextDouble();
//        System.out.print("Enter the operation you want to perform with a and b = ");
//        char opearatiion = sc.next().charAt(0);
//
//        switch(opearatiion){
//            case '+' :
//                System.out.println(a+b);
//                break;
//            case '-' :
//                System.out.println(a-b);
//                break;
//            case '*':
//                System.out.println(a*b);
//                break;
//            case '/':
//                if (b!=0) {
//                    System.out.println(a / b);
//                }else {
//                    System.out.println("can not divid it by 0");
//                }
//                break;
//            default:
//                System.out.println("invalid comand");
//        }




               ///////////////////// for loop ////////////////////////////////////
//    for(int i= 0; i<=10 ; i++ ){
//        System.out.println(i + " vishal is a tip G ");
//    }



        //////////////////////////// while loops //////////////////////
//        int i=1;
//        while(i<=10) {
//            System.out.println(i+" vishal is a chad ");
//            i++;
//        }





        //////////////////////////// do while loop ////////////////////////////////

//        int i=1;
//        do {
//            System.out.println(i+" vishal is a sigma ");
//            i++;
//        }while (i>10);
//
//





        ////////////////////////// pattter qustions
        //**********
        //**********
        //**********
        //**********
        //**********

//        int v = 10 ;
//        int h = 5 ;
//        for (int i = 1 ; i<=h ; i++ ){
//
//            for (int j=1 ; j<=v ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }





        //////////////// second pattern qustion //////
        //*****
        //*   *
        //*   *
        //*****
//        int n = 4;
//        int m = 5;
//
//        for(int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=m ; j++){
//                if (i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }






        //////////////// 3rd pattern qustion
        //*
        //**
        //***
        //****

//        int n=4;
//        for (int i=1 ; i<=n ; i++ ){
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }System.out.println();
//        }



        /////////////////// 4th pattern qustion
        //****
        //***
        //**
        //*
//        int n=4;
//        for (int i=n;i>=1; i--){
//            for (int j=1; j<=i ;j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }





///////////////// 5th patter qustion
//   *
//  **
// ***
//****
//        int n=4 ;
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=n-i ; j++){
//                System.out.print(" ");
//            }
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }System.out.println();
//        }


        /////////////2nd types to print it

//        for (int i=1 ; i<=4 ; i++){
//            for (int j=n-i ; j>=1 ; j-- ) {
//                System.out.print(" ");
//            }
//            for (int k=1 ; k<=i ; k++ ){
//                System.out.print("*");
//                    }System.out.println();
//        }






        ////////////////// 6th pattern qustion including numbers
        //1
        //12
        //123
        //1234
        //12345
//        int n=5 ;
//        for (int i=1 ; i<=n ;i++){
//            for (int j=1 ; j<=i ; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }




///////////// 7th pattern qustion including numbers
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//        int n=5 ;
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=n-i+1 ; j++ ){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

/////////////// 8th pattern qustion including numbers
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

//        int n= 5;
//        int number = 1;
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=i ; j++){
//                System.out.print(number + " " );
//                number++;
//            } System.out.println();
//        }




/////////////// 8th pattern qustion including numbers
//1
//01
//101
//0101
//10101
//        int n= 5 ;
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=i ; j++){
//                if ((i+j)%2==0){
//                    System.out.print("1 ");
//                }else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }




        /////////////// 9th pattern qustion
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *
//* * * * *

//        int n=5;
//        for (int i=1 ; i<=n ; i++){
//            for (int j=1 ; j<=n-i ; j++){
//                System.out.print(" ");
//            } for (int j=1 ; j<=n ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }





        /////////////// 10th pattern qustion
//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5
//        int n=5 ;
//        for (int i=1  ;  i<=n ; i++){
//            for(int j=1 ; j<=n-i ; j++){
//                System.out.print(" ");
//            }
//            for ( int j=1 ; j<=i ; j++ ){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }





        /////////////// 11th pattern qustion
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5


//        int  n=5;
//        for (int i=1 ; i<=n ; i++){
//            int num = 2;
//            for (int j=1 ; j<=n-i ; j++){
//                System.out.print("  ");
//            } for (int j=i ; j>=1 ; j--){
//                System.out.print(j+" ");
//            } for (int j=2 ; j<=i ; j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }




        /////////////// 12 th pattern qustion


//*              *
//* *          * *
//* * *      * * *
//* * * *  * * * *
//* * * *  * * * *
//* * *      * * *
//* *          * *
//*              *


//        int n = 4 ;
//        for (int i=1 ; i<=n ; i++){
//            //1st
//            for (int j=1 ; j<=i ;j++ ){
//                System.out.print("* ");
//                //2nd
//            }for (int j=1 ; j<=(2*(n-i)) ; j++){
//                System.out.print("  ");
//
//            }for(int j=1 ; j<=i ; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for (int i=n ; i>=1 ; i--){
//            //1st
//            for (int j=1 ; j<=i ;j++ ){
//                System.out.print("* ");
//                //2nd
//            }for (int j=1 ; j<=(2*(n-i)) ; j++){
//                System.out.print("  ");
//
//            }for(int j=1 ; j<=i ; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }



        /////////////// 12 th pattern qustion
//      *
//    * * *
//  * * * * *
//* * * * * * *
//* * * * * * *
//  * * * * *
//    * * *
//      *
//        int n = 4 ;
//    for (int i =1 ; i<=n ; i++){
//        for (int j=1 ; j<=n-i ; j++ ){
//            System.out.print("  ");
//        }for (int j=1 ; j<=i ; j++){
//            System.out.print("* ");
//        }for (int j=2 ; j<=i ; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//        for (int i=n ; i>=1 ; i--){
//            for (int j=1 ; j<=n-i ; j++ ){
//                System.out.print("  ");
//            }for (int j=1 ; j<=i ; j++){
//                System.out.print("* ");
//            }for (int j=2 ; j<=i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        }
//    }

        /////////////// 13 th pattern qustion


//*        *
//**      **
//* *    * *
//*  *  *  *
//*   **   *
//*   **   *
//*  *  *  *
//* *    * *
//**      **
//*        *

    int n=8 ;
    int m=16 ;
    for (int i=1 ; i<=n ; i++){
        for (int j=1 ;j<=m ;j++){
            if (i==j || j==1 || j==m|| j==m-i+1 ){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
        for (int i=n ; i>=1 ; i--){
            for (int j=1 ;j<=m ;j++){
                if (i==j || j==1 || j==m|| j==m-i+1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





    }
}
























