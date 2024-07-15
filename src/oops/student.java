package oops;

public class student {
    public String name;
    Integer regno;
    Integer year;

    static int numberofstudent;
    private String sport;


    public student(String name, Integer regno, Integer year, String sport) {
        this.name = name;
        this.regno = regno;
        this.year = year;
        this.sport = sport;
        numberofstudent++;
    }

    public student() {
        numberofstudent++;
    }

    public static int getNumberofstudent() {
        return numberofstudent;
    }

    public String getSport() {
//        System.out.println(sport);
        return sport;
    }

    public void setSport(String sports){
        this.sport=sports;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", regno=" + regno +
                ", year=" + year +
                ", sport='" + sport + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Name of the student = " + this.name + " \nRegstration number of the student : " + this.regno + "\nPersuing year = " + this.year);
    }

    public static void main(String[] args) {
        student s11=new student();
        s11.sport="badmintion";
        System.out.println(s11.sport);
    }
}
