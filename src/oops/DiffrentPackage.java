package oops;
// in thise code we are calling diffrerent classes from oops package to show that ones we have made any class in same package we can call it anywhere
// but if we have to call it outside of oops package we need to import the oops package for @example opps.Objectoriented this way .

public class DiffrentPackage {
    public static void main(String[] args) {
        student s3 = new student();
        s3.name=" DAM BOY ";
        s3.regno=799;
        s3.year=4;
        s3.info();
        System.out.println();
        pen p3 = new pen();
        p3.color="blue";
        p3.type="pencil";
        p3.write();
        p3.color();

        System.out.println();
        student s4=new student();
        s4.name="kion";
        s4.regno=20219736;
        s4.year=2;
        s4.info();

        System.out.println();
        pen p4 = new pen();
        p4.color="pink";
        p4.type="killer";
        p4.color();
    }
}
