
import java.util.Scanner;

public class methods2 {
    public static void main(String[] args) {
//        int myFavNum = 23;
//        System.out.println(myFavNum);
//
//        String myString = "Aniya";
//        System.out.println(myString);

//        Change your code to assign a character value to myString. What do you notice?

//        String otherString = 'D'; //char cannot be converted
//        System.out.println(otherString);

//        Change your code to assign the value 3.14159 to myString. What happens?

//        String newString = 3.14159; //incompatible types: double cannot be converted to java.lang.String
//        System.out.println(newString);


//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        System.out.println(myNumber); //variable myNumber might not have been initialized


//        Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14; // possible lossy conversion from double to long
//        System.out.println(myNumber);

//        Change your code to assign the value 3.14 to myNumber. What do you notice?


//        long myNumber;
//        myNumber = 123L;
//        System.out.println(myNumber);

//        float myNumber;
//        double myNumber;
//        myNumber = 3.14; //java: incompatible types: possible lossy conversion from double to float fix by changing to double
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++); //prints 5
//        System.out.println(x); // print 6

        int x = 5;
        System.out.println(++x); //print 6
        System.out.println(x); //print 6

//        String class; // not a statement

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        Explicit  casting from more precise to less precise
        double pi = 3.1459;
        int almostPi = (int) pi;
        System.out.println(almostPi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);


//        System.out.println("Enter a number");
//        int userInput1 = scanner.nextInt();
//        System.out.println(userInput1);
//
//        System.out.println("Enter a integer");
//        double userInput2 = scanner.nextDouble();
//        System.out.println(userInput2);
//
//        System.out.println("Enter a number");
//        int userInput4 = scanner.nextInt();
//        System.out.println(userInput4);

//        System.out.println("Enter a integer");
//        int userInput1 = scanner.nextInt();
//        System.out.println(userInput1);

//        System.out.println("Enter 3 words");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("The user input %s\n %s\n %s \n",  userInput1, userInput2, userInput3);

//        System.out.println("Please enter the length and width of your room");
//        String userLength = scanner.next();
//        String userWidth = scanner.next();
//        System.out.printf("userLength: %s userWidth: %s", userLength, userWidth);
//
//        int length = Integer.parseInt(userLength);
//        int width = Integer.parseInt(userWidth);
//
//        int area = length * width;
//        System.out.println("\n area is: " + area);
//
//        int perimeter = 2 * length + 2 * width;
//        System.out.println("\n perimeter is:" + perimeter);
//
//        scanner.useDelimiter("\n");

        //while loop must declare i
//        int i = 5;
//        while(i <= 15){
//            i++;
//            System.out.println(i);
//        }

//        do while loop

//        int i = 0;
//        do{
//            i = i + 2;
//            System.out.println(i);
//
//        }while(i < 100);

//        for(int i = 0; i < 100; i+=2){
//            System.out.println(i);
//        }
//
//        int i = 100;
//        do{
//            i = i - 5;
//            System.out.println(i);
//
//        }while(i > -10);


//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

//        long i = 2L;
//        do{
//            i = i * i ;
//            System.out.println(i);
//
//        }while(i < 1000000);

//        for (long i = 100; i >=-10; i-=5){
//            System.out.println(" for loop -5: " + i);
//        }

//        for(int i = 1; i < 100; i++){
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("FizzBuzz: " + i);
//            }else if (i % 3 == 0){
//                System.out.println("Fizz: " + i);
//            }else if (i % 5 == 0){
//                System.out.println("Buzz: " + i);
//            }else {
//                System.out.println(i);
//            }
//        }


//        String isContinue;
//        int squaredNum;
//        int cubedNum;
//        do {
//            System.out.println("Enter an integer (up to 5)");
//            int userInput = scanner.nextInt();
//            System.out.println(userInput);
//            System.out.println("number | squared | cubed");
//            for (int i = 1; i <= userInput; i++) {
//                squaredNum = i * i;
//                cubedNum = i * i * i;
//
//                System.out.printf("    %s | %s |%s \n", i, squaredNum, cubedNum);
//            }
//
//                System.out.println("Would you like to continue (yes/no)");
//                isContinue = scanner.next();
//
//        }while(isContinue.equalsIgnoreCase("yes"));


//        int squaredNum;
//        int cubedNum;
//        String isContinue;
//        do {
//            System.out.println("What number would you like to go up to? 5\n");
//            int userInput = scanner.nextInt();
//            System.out.println("number | squared | cubed\n");
//            for (int i = 1; i <= userInput; i++) {
//                squaredNum = i * i;
//                cubedNum = i * i * i;
//                System.out.printf("%s    |    %s |   %s\n", i, squaredNum, cubedNum);
//            }
//
//            System.out.println("Would you like to continue(yes/no");
//            isContinue = scanner.next();
//
//        } while (isContinue.equalsIgnoreCase("yes"));
//        String isContinue;
//        do {
//            System.out.println("Enter a grade from 0 to 100");
//            int userInput = scanner.nextInt();
//            if (userInput >= 88) {
//                System.out.println("A");
//            } else if (userInput >= 80) {
//                System.out.println("B");
//            } else if (userInput >= 67) {
//                System.out.println("C");
//            } else if (userInput >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.println("Would you like to continue (yes/no)");
//            isContinue = scanner.next();
//        } while (isContinue.equalsIgnoreCase("yes"));


//        System.out.println("We don't need no education\n" +
//                "We don't need no thought control");
//
//        System.out.println("In windows, the main drive is usually C:\\");
//
//        System.out.println("Check \"this\" out!, \"s inside of \"s!\n");

    }

}
