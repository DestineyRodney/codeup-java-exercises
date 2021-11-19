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

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    boolean yesNo(){
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
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

//    int getInt(){
//        return scanner.nextInt();
//    }

    public int getInt(){
        try {
            String newString = getString();
            return Integer.valueOf(newString);
        } catch (Exception e){
            System.out.println("Please enter an integer");
            return getInt();
        }
    }

    public int getInt(String prompt){
    int number;
        try {
            number = Integer.valueOf(getString(prompt));
    return number;
        } catch (Exception e){
            System.out.println("Please try again");
            return getInt(prompt);
        }
    }

    double getDouble(double min, double max){
        double userInt;
        userInt = this.scanner.nextDouble();

        if(userInt <= max && userInt >= min){
            return userInt;
        } else {
            System.out.println("Please enter a new number between" + min + " and " + max);
            return getDouble(min, max);
        }
    }

//    public double getDouble(){
//        return this.scanner.nextDouble();
//    }

    public double getDouble(){
        try {
            String newString = getString();
            return Double.valueOf(newString);
        }catch(Exception e){
            System.out.println("please enter a double");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        double number;
        try{
            number = Double.valueOf(getString(prompt));
            return number;
        } catch (Exception e){
            System.out.println("Please enter a double:");
            return getDouble(prompt);
        }

    }


}
