package oops;

class fraction{
    double numerator;
    double denominator;


    public fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void simplify(double num , double deno){

        if (num<deno){

        }
    }
}






public class FractionClass {
    public static void main(String[] args) {

        fraction f1 = new fraction(7,21);
        fraction f2 = new fraction(38,56);
        System.out.println(f1.numerator+"/"+f1.denominator);
        System.out.println(f2.numerator+"/"+f2.denominator);

        f1.simplify(f1.numerator,f1.denominator);
    }
}
