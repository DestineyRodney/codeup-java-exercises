import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is: %.2f.\n", pi);

 Scanner scanner = new Scanner(System.in);
//  1.     Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        What happens if you input something that is not an integer?
//        ERROR: will not run
//    System.out.print("Enter a integer:");
//    int userInputInt = scanner.nextInt();
//        System.out.printf("You entered: %s", userInputInt);

//   2.     Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//                What happens if you enter less than 3 words?
//        it will not run until you enter another word
//                What happens if you enter more than 3 words?
//        only the first three show up

//        System.out.println("Enter 3 words:");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("You entered these three words: %s %s %s.\n", userInput1, userInput2, userInput3);

// 3.       Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        do you capture all the words? No only the first word

//        System.out.println("Enter a sentence:");
//        String userSentenceInput = scanner.next(); //RETURNS AS A STRING
//        System.out.printf("You entered: %s", userSentenceInput);

//4. Rewrite the above example using the nextLine method.
//        System.out.println("Enter a sentence:");
//        String userSentenceInput2 = scanner.nextLine(); //RETURNS AS A STRING
//        System.out.printf("You entered: %s", userSentenceInput2);

//part 2        Calculate the perimeter and area of Codeup's classrooms.

//1.        Prompt the user to enter values of length and width of a classroom at Codeup.


        System.out.print("Enter rooms length and width:");
        String userLengthInput = scanner.next();
        String userWidthInput = scanner.next();

//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
        int length = Integer.parseInt(userLengthInput);
        int width = Integer.parseInt(userWidthInput);

//2. Display the area and perimeter of that classroom.

//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        int roomArea = length * width;
        int roomPerimeter = 2 * (length * width);
        System.out.println("The area of my room is " + roomArea + " sft");
        System.out.println("The perimeter of my room is " + roomPerimeter + " ft.");

    }
}
