package Hashing;
import java.util.*;
public class findingItineraryFromTickets {
    public static String stratingPoint(HashMap<String,String> map){
        HashMap<String,String> revmap = new HashMap<>();
        String start = "";
        for (Map.Entry<String,String>key:map.entrySet()){
            revmap.put(key.getValue(), key.getKey());
        }
        for (String key:map.keySet()){
            if (!revmap.containsKey(key)){
                return key;
            }
        }
    return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("chennai","bengaluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");

        String start= stratingPoint(map);

        System.out.println(start);
    }
}
