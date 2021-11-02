import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args){
        int mul = multiply(25, 3);
        System.out.println(mul);
        int div = divide(5, 1);
        System.out.println(div);

        System.out.print("Enter a number between 1 and 10: ");
        int userNum = getInteger(1, 10);
    }
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int divide(int num1, int num2){
            return num1 / num2;
    }

    public static int multiply(int num1, int num2){
            return num1 * num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

//    Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);
//    and is used like this:


//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if (userNum >= min & userNum <= max) {
            System.out.println(userNum);
            return userNum;
        } else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }
    }
}

