import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        int add = add(5, 1);
//        System.out.println(add);
//
//        int sub = subtract(5, 1);
//        System.out.println(sub);
//
//        int mul = multiply(25, 3);
//        System.out.println(mul);
//
//        int div = divide(5, 1);
//        System.out.println(div);
//
//        int mod = modulus(5, 3);
//        System.out.println(mod);

//        int userNum = getInteger(1, 10);

//        factorial();

        dice();
    }

    //    Basic Arithmetic
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);
//    and is used like this:

//    Create a method that validates that user input is in a certain range


    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");

        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if (userNum >= min & userNum <= max) {
            System.out.println("The user number is " + userNum + " and is between 1 and 10.");
            return userNum;
        } else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }
    }

    //    Calculate the factorial of a number.
    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        String toContinue;
        int userInt;
        int factorial = 1;
        String middle = "1";

        do {
            userInt = getInteger(1, 10);

            for (int i = 1; i <= userInt; i++) {
                if (i > 1) {
                    middle += " x " + i;
                }
                factorial *= i; // multiply by iterator
                System.out.printf("%s! = %-40s = %s%n", i, middle, factorial);
                //pos ut space before and neg put space after
            }
            System.out.println("Would you like to enter another number to add to factorial? (Yes/No)");
            toContinue = scanner.nextLine();
        } while (toContinue.equalsIgnoreCase("Yes"));
        return factorial;
    }

    //    Create an application that simulates dice rolling.
    public static int dice() {
        Scanner scanner = new Scanner(System.in);
        String toContinue;
        do {
            System.out.println("How many sides would you like the dice to have: ");
            int diceSide = scanner.nextInt();
            System.out.println("Roll the dice.");
            int roll1= (int) (Math.random() * diceSide + 1);
            int roll2 = (int) (Math.random() * diceSide + 1);
            System.out.printf("You just rolled %d and %d!\n", roll1, roll2);
            System.out.print("Would you like to roll the dice again?(Yes/No) ");
            toContinue = scanner.next();
        } while (toContinue.equalsIgnoreCase("Yes"));
        return dice();
    }
}

