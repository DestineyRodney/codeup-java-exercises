package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner;

    //constructor
    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.nextLine();
    }

    boolean yesNo(){
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    int getInt(int min, int max){
        int userInt;
        userInt = this.scanner.nextInt();

        if(userInt <= max && userInt >= min){
            return userInt;
        } else {
            System.out.println("Sorry that number is not valid. Please enter a new number between" + min + " and " + max);
            return getInt(min, max);
        }
    }

    int getInt(){
        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        double userInt;
        userInt = this.scanner.nextDouble();

        if(userInt <= max && userInt >= min){
            return userInt;
        } else {
            System.out.println("Sorry that number is not valid. Please enter a new number between" + min + " and " + max);
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

}
