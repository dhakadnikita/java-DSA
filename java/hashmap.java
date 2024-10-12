import java.util.HashMap;
import java.util.*;

public class hashmap {
    public  static void main(String[]args){
        //country(key),population(value)
        HashMap<String,Integer>map  = new HashMap<>();


        //insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map);
        

       //search
        if(map.containsKey("Indonesia")){
            System.out.println("Key is present in the map");

        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

        

        //for(int val : arr)
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ "  " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);


    }
    
}
