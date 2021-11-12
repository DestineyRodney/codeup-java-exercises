package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        System.out.println("Enter a string");
        Input input = new Input();
//        String userInput1 = input.getString();
//        System.out.println(userInput1);

//        System.out.println("Are you okay? (Y/N)");
//        boolean userInput2 = input.yesNo();
//        System.out.println(userInput2);
//

        System.out.println("Enter a number");
        int userInput3 = input.getInt();
        System.out.println("The number you entered is: " + userInput3);

        System.out.println("Enter a number between 1 and 10");
        int userInput4 = input.getInt(1, 10);
        System.out.println("The number you entered between 1 and 10 is: " + userInput4);

//            System.out.println("Enter a decimal number between 1 and 10");
//            double userInput5 = input.getDouble(1, 10);
//            System.out.println(userInput5);
//
        System.out.println("Enter a decimal");
        double userInput6 = input.getDouble();
        System.out.println(userInput6);

    }

}
