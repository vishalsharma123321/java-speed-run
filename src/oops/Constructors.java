package oops;
import java.util.SortedMap;

class NonParametrizedConstructor{
    String laptop;
    int ram;
    String storageType;

    public NonParametrizedConstructor(){
        this.laptop="unknown";
        this.ram=16;
        this.storageType="ssd";
        System.out.println("Bitch");
    }

    public void laptopInfo(){
        System.out.println("your laptop is "+laptop+"\nyour ram is "+ram+"\nyour stroage type is "+storageType);
    }
}
class ParameterizedConstructor{
    String car;
    String color;
    String model;
    public ParameterizedConstructor(String car , String color , String model) {
        this.car = car;
        this.color=color;
        this.model=model;

        System.out.println("calling parametrized constructor :");
    }
    public void carInfo(){
        System.out.println(this.car+"\n"+this.color+"\n"+this.model);
    }
}
public class Constructors {
    public static void main(String[] args) {

//        NonParametrizedConstructor n1 = new NonParametrizedConstructor();
//        n1.laptopInfo();


        ParameterizedConstructor npc = new ParameterizedConstructor("TATA","BLACK","NEXON EV");
        npc.carInfo();
    }
}
