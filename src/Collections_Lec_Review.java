import java.util.ArrayList;
import java.util.HashMap;

public class Collections_Lec_Review {
    public static void main(String[] args) {
//Must be in a main
//ArrayList<type> arrayname = new ArrayList<>()
//        if int must say Integer for type
        //add
        ArrayList<String> names = new ArrayList<>();
        names.add("Billy");
        names.add("Jean");
        System.out.println(names);

        //size
        System.out.println(names.size());

        //get
        System.out.println(names.get(1));

        //indexOf

        System.out.println(names.indexOf("Billy"));
        System.out.println(names.indexOf("Ray")); //prints -1 if not n array


        //HASHMAPS: DATA STRUCTURE FOR KEY VALUE PAIRS
        HashMap<String, String> usernames = new HashMap<>();
        //.put	set a key-value pair
        //.get	return the value associated with the given key, or null
        //.getOrDefault	like .get, but with a defined value instead of null
        //.containsKey	check if a key exists in the map
        //.containsValue	check if a value exists in the map

        usernames.put("Destiney", "Rodney");
        usernames.put("Elexius", "Lewis");

        //.get
        System.out.println(usernames.get("Destiney"));

        //.get default

        System.out.println(usernames.getOrDefault("Royal", "Cannaday"));



    }
}
