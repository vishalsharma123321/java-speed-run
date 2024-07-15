package ArrayList;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(25);
        list.add(15);
        list.add(5);
        list.add(65);
        // printing the ArrayList
        System.out.println(list);

        // getting the element from the third position;
        System.out.println(list.get(3));

        // adding new element at the second position in the ArrayList.
        list.add(2,69);
        System.out.println(list);

        // getting the size of the ArrayList .
        System.out.println("The size of the ArrayList is = "+list.size());

        // removing an element from the ArrayList;
        list.remove(5);

        // let's check the size of the ArrayList after removing one element .
        System.out.println(list);
        System.out.println("The size of the ArrayList after removing on element is = "+list.size());

        // In this way we can also print the ArrayList .
        for (int l: list){
            System.out.println(l);
        }

        // in this way we can iterate the list using the for loop . 
        for (int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }

        int add =list.get(1)+4;

        System.out.println("add " +add );




    }
}
