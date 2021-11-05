import java.util.Arrays;

public class ArraysLecReview {
    public static void main(String[] args) {
//        String[] strings = {}; //length = 0
//        strings[0] = "hello"; //Index 0 out of length bounds  will comppile but not run
//        System.out.println("strings[0] = " + strings[0]);
//
//        String[] names = {"Destiney", "ShanShan"}; //length is 2
//        System.out.println("names[0] = " + names[0]);
//        System.out.println("names[1] = " + names[1]);

//        names[2] = "Justin";
//        System.out.println(names[2]); // will compile but error  Index 2 out of bounds for length 2

        String[] names2 = new String[3]; // array is 3 long
        names2[0] = "Justin";
        names2[1] = "Destiney";
        names2[2] = "ShanShan";


        System.out.println("names2[0] = " + names2[0]);
//

        Person shan = new Person("ShanShan");
        System.out.println("shan.getName() = " + shan.getName());
        shan.setName("Destiney");
        System.out.println("shan.getName() = " + shan.getName());

        names2[0] = "Kenneth"; //reassign
        System.out.println("names2[0] = " + names2[0]);

        //print out entire Array use Arrays.toString
        System.out.println("Arrays.toString(names2) = " + Arrays.toString(names2));

        int[] integers = {1, 2, 3, 4, 5};
        System.out.println("integers = " + integers);
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        //Arrays.fill
        String[] names3 = {"Kenneth", "Destiney", "ShanShan"};
//        System.out.println("names2 == names3 = " + names2 == names3); // incompatibale
        System.out.println("Arrays.equals(names2, names3) = " + Arrays.equals(names2, names3));

        Arrays.fill(names3, "Douglas");
        System.out.println("Arrays.toString(names3) = " + Arrays.toString(names3));

        Arrays.fill(names3, 0, 2, "Destiney");
        System.out.println("Arrays.toString(names3) = " + Arrays.toString(names3));

        //Arrays.copyOf equivalent to array.push

        String[] names4 = Arrays.copyOf(names2, names2.length + 1); // gives null because names 2 only has 3 elements
        System.out.println("Arrays.toString(names4) = " + Arrays.toString(names4));
        names4[names4.length -1] = "Douglas"; // add value to last element of length
        System.out.println("Arrays.toString(names4) = " + Arrays.toString(names4));

        String[] names5 = pushAName(names2, "Alex");
        System.out.println("Arrays.toString(names5) = " + Arrays.toString(names5));

//        //Arrays.sort
        int[] numbers= {1, 6, -4, 9, 7, 16, -25};
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        Arrays.sort(names5);
        System.out.println("Arrays.toString(names5) = " + Arrays.toString(names5));

        //make your own sort
        Arrays.sort(names5, 0,1);
        System.out.println("Arrays.toString(names5) = " + Arrays.toString(names5));

        //binarySearch like index Of

        System.out.println("Arrays.binarySearch(numbers, 9) = " + Arrays.binarySearch(numbers, 9));

    }
//    make a method
    public static String[] pushAName(String[] names, String name){
        String[] newStrings = Arrays.copyOf(names, names.length +1);
         newStrings[newStrings.length -1] = name;
         return newStrings;

    }
    //js
    //let(var, or const) numbers = [1, 2, 3, 4, 5, "hello", "world"]
    //in js can do numbers.push(6) or numbers.pop() but cant in jJava
    //in js if we do console.log(numbers); // [1,2,3,4,5]

    //Java
    //declare a variable
    //must tell data type variableName == ...
    //in java every datatype is an objet so must use brackets
    //in java we have to use Arrays.toString


}
