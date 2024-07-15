package oops;
// in this code we are learning overloading and call by referance and call by value in which we can change the value of classes by call by reference but
// we can not can not change the value of not class or object value in function or method . for example see the two function changebyclass and chanebyvalue.

//import static oops.OverLoading.change;
import static oops.OverLoading.changebyvalue;

class OverLoading{
    String name;
    int age;
    double weight;

    public void info(String name){
        System.out.println("your name = "+name);
    }


    public void info(int age){
        System.out.println("Your age = "+age);
    }
    public void info(String name , int age , double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        System.out.println(name+age+weight);
    }


    public void changebyclass(OverLoading age) {
        age.age=26;
    }

    public static void changebyvalue(double x){
        x=56.6;
    }

}

class Polymorphism{
    public static void main(String[] args) {
        System.out.println("hi");

        OverLoading o1 = new OverLoading();

//        o1.weight=56.55;

//        o1.indo(21);
//        o1.info("vishal");
//        o1.info("vishal",25,36);
        o1.name = "";
        o1.name = "vishal";
        System.out.println(o1.name);
        o1.changebyclass(o1);
        System.out.println(o1.name);

        o1.age = 21;
        System.out.println(o1.age);
        o1.changebyclass(o1);
        System.out.println(o1.age);

        double x=834.06;
        System.out.println(x);
        changebyvalue(x);
        System.out.println(x);

    }
}













