import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileIOLec {
    public static void main(String[]args) throws IOException, IOException {
    //CREATING files and directories in Java

    String directory = "./src/data"; //name for pathway we'd want to create //dont currently have data package or file
    String filename = "groceryList.txt";
    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename); //building path combining directory path plus desired file name.
    System.out.println(dataFile);

    if(Files.notExists(dataDirectory)){
        Files.createDirectories(dataDirectory); // added data directory folder to src directory

    }
    if(Files.notExists(dataFile)){
        Files.createFile(dataFile);
    }

    // Write into a text file
        //how do i get to file
        Path groceriesTxtPath = Paths.get(directory, filename
         ); // WE GOT DIRECTORY AND FILE

        System.out.println(Files.exists(groceriesTxtPath));

        List<String> groceryList = Arrays.asList("dog food", "coffee", "milk", "icecream"); //Arrays helper class is called here "ASLIST" to make a List datatype of what we passed into arrays helper class
        System.out.println("groceryList = " + groceryList);

        Files.write(groceriesTxtPath, groceryList);

        //READING FROM FILE
        List<String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ":" + groceryList.get(i));


        }
//    Files.write(groceriesTxtPath, Arrays.asList("eggs", "milkbones", "tea"), StandardOpenOption.APPEND);
//        //need to get updated text file
//     printList = Files.readAllLines(groceriesTxtPath);
//
//        for(int i = 0; i < printList.size(); i++) {
//            System.out.println((i + 1) + ":" + groceryList.get(i));
//        }

        //last example dive into .txt doc and get cureent list and update one line
//        groceryList = Files.readAllLines(groceriesTxtPath);
//        List<String> newList = new ArrayList<>(); //polymorph

//        for(String line : groceryList){
//            if(line.equalsIgnoreCase("eggs")){
//                newList.add("brown eggs"); //overrides specific line
//                continue; // if it finds eggs it will add brown eggs SKIP and go on without original eggs
//            }
//            newList.add(line);
//        }
//        System.out.println(newList);
//        Files.write(groceriesTxtPath, newList);
    }
}
