package oops;
// this code will work because we have created a student class in different to make it main but its
// in sam package so we can make object of student in this class .
class pen{
    String color ;
    String type ;
    public void write()
    { System.out.println("writing something mother fucker :");
    }
    public void color(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}


public class Oops {
    public static void main(String[] args) {
        pen pen1= new pen();
        pen1.color="red";
        pen1.type="gellPen";

        pen pen2 = new pen();
        pen2.color="black";
        pen2.type="boolpoint";
        pen1.write();
        pen2.write();
        pen1.color();
        pen2.color();

        student s1=new student();
        s1.name="vishal sharma ";
        s1.regno=20219836;
        s1.year=2;
        s1.info();

        student s2 = new student();
        s2.name=" Drop vox ";
        s2.regno=983694;
        s2.year=3;
        s2.getSport();
        System.out.println(s2.getSport());
        s2.setSport("badmintion");
        System.out.println(s2.getSport());
//        s2.sport="tabletenis";
//        System.out.println(s2.sport);

        student s3 = new student("vishal",56,56,"swiming");
        System.out.println(s2.numberofstudent);
        System.out.println(student.numberofstudent);



//        s2.info();

    }
}
