public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
//        Refactor your code to use two System.out.print statements without changing the output.
        System.out.print(" World!");

//        Question 1
        int myFavoriteNumber = 2;
        System.out.println("\n My favorite number is: " + myFavoriteNumber);
//        Question 2
        String myString = "\n I can't wait to deliver my little man.";
        System.out.println(myString);
//        Question 3
//        String myString = "N";
//        System.out.println(myString);
//        ERROR java: variable myString is already defined in method main(java.lang.String[])

//        Question 4
//        String myString1 = 3.14159;
//        System.out.println(myString);
        // ERROR double cannot be converted to string

//        Question 5
//        long myNumber;
//        System.out.println(myNumber);
//        ERROR: variable myNumber might not have been initialized

//        Question 6
//        myNumber = 3.14
//        System.out.println(myNumber);
//         ERROR: incompatible types: possible lossy conversion from double to long

//         Question  7
//            myNumber = 123L;
//            System.out.println(myNumber);

        //         Question  8
//        myNumber = 123;
//        System.out.println(myNumber);
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
// Assigning 3.14 to a long does not work because of the decimal instead a double needs to be used.

        //         Question  9
//        float myNumber = 3.14;
//        System.out.println(myNumber);
//       ERROR: java: incompatible types: possible lossy conversion from double to float

//                  Question  10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y= 5;
//        System.out.println(++y);
//        System.out.println(y);
//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//    x iterates after so 5 shows for the first print then it iterates and 6 is produced whereas y iterates before first print so 6 is shown for both

//                  Question 11
//        String class = "hello codeup";
//        System.out.println(class);
// Doesn't work because class is a reserved keyword

//                  Question  12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//       ERROR: class java.lang.String cannot be cast to class java.lang.Integer

//        int three = (int) "three";
//        ERROR: String cannot be converted to int

//                Question  13
//        int x = 4;
//        x = x + 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println("y = " + y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println("y = " + y);

//                Question 14
        int a = Integer.MAX_VALUE;
        a += 1;
        System.out.println("a = " + a);
        //a = -2147483648
    }
}

//\n creates a new line

//    Try renaming the main method. What happens when you try to run the program?
//Error: Main method not found in class HelloWorld, please define the main method as:
//public static void main(String[] args)
//        or a JavaFX application class must extend javafx.application.Application

