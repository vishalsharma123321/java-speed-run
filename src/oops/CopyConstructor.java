package oops;

class copy{
    String name;
    String id;
    int year;

    copy(){

    }
    public copy(copy other){
        this.name= other.name;
        this.id=other.id;
        this.year=other.year;
    }

    public void info(){
        System.out.println(this.name+"\n"+this.id+"\n"+this.year);
    }

}
public class CopyConstructor {
    public static void main(String[] args) {

        copy c1= new copy();
        c1.name="vishal";
        c1.id="GF20219836";
        c1.year=3;

        copy c2=new copy(c1);
        c2.info();

    }
}
