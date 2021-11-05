import java.util.ArrayList;
import java.util.HashMap;
//import java.util.*; imports everything

public class CollectionsLec {
//   OLD WAY
    public static void main(String[] args) {
//        String[] nameOfVar = {"things1", "thing2", "things3"};

//        System.out.println(nameOfVar[3]); // ouside length

        ArrayList<String> students = new ArrayList<>();

        students.add("Destiney");
        students.add("ShanShan");

        System.out.println("students.size() = " + students.size());
        System.out.println(students); // dont need Arrays.toString

        ArrayList<Integer> favNums = new ArrayList<>();
        favNums.add(2);
        favNums.add(22);
        System.out.println(favNums); //still send to strings

        favNums.add(0, 23);
        favNums.add(3, 23);
        favNums.add(favNums.size(), 200); //adds to end without knowing index


        System.out.println(favNums); //still send to strings
        System.out.println("favNums.size() = " + favNums.size());

        //indexOf
        System.out.println("favNums.indexOf(22) = " + favNums.indexOf(22));

        //get at this index
        System.out.println("favNums.get(2) = " + favNums.get(2));

        //boolean is number included

        System.out.println("favNums.contains(23) = " + favNums.contains(23));

        //mult elements same value ex 23 Use last index
        System.out.println(favNums);
        System.out.println("favNums.lastIndexOf(23) = " + favNums.lastIndexOf(23));

        //isEmpty
        System.out.println("favNums.isEmpty() = " + favNums.isEmpty()); //false there are numbers

        //remove int
        favNums.remove((Integer) 23);
        System.out.println(favNums);

        //remove object
        students.remove("Destiney");
        System.out.println(students);

        //Test
        ArrayList<Integer> removalList = new ArrayList<>();
        removalList.add(43);
        removalList.add(44);
        removalList.add(45);



        favNums.removeAll(removalList);
        System.out.println(favNums);

        System.out.println("Hash Maps");

        //HashMap<keyDatatype, value datatype> nameVar = new HashMap<>();
        HashMap<String, String> userNames = new HashMap<>();

        //Inserting value pairs into HashMaps
        userNames.put("Kenneth", "ken2cool");
        userNames.put("Destiney", "dessy327");
        userNames.put("ShanShan", "theGOAT");

        System.out.println("userNames.get(\"ShanShan\") = " + userNames.get("ShanShan"));

        System.out.println("userNames.get(\"Alex\") = " + userNames.get("Alex")); //returns null because we didnt have ALEX as a key

        //Provides default instead of null
        System.out.println("userNames.getOrDefault(\"Alex\", \"noUserFound\") = " + userNames.getOrDefault("Alex", "noUserFound"));

        //CONTAINSKEY
        System.out.println("userNames.containsKey(\"ShanShan\") = " + userNames.containsKey("ShanShan"));
        //CONTAINSVALUE
        System.out.println("userNames.containsKey(\"theGOAT\") = " + userNames.containsValue("theGOAT"));

    userNames.putIfAbsent("ShanShan", "Shan210");
   userNames.putIfAbsent("Alex", "mainAlex");

        System.out.println(userNames);

        System.out.println();
        System.out.println(userNames);

        //remove
        userNames.remove("ShanShan");
        System.out.println(userNames);

        //replace
        userNames.replace("Alex", "Alex123");
        System.out.println(userNames);

        //clear
        userNames.clear();
        System.out.println(userNames.isEmpty());


    }
}
