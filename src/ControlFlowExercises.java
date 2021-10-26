import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

// 1a       Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15



//        int i = 5;
//        while(i <= 15){
//            System.out.print(i);
//            i++;
//        }

//1b        Do While
//
//        1.Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        2.Alter your loop to count backwards by 5's from 100 to -10.
//        3.Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
//  1b. Part1
//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 2;
//        } while (i <= 100);
//  1b. Part2
//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        } while (i >= -10);
// 1b. Part3
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while (i < 1_000_000);
//


// 1c.       Refactor the previous two exercises to use a for loop instead.
//1a refactor
//        for(int i = 5; i <= 15; i++ ){
//            System.out.println(i);
//        }
//1b Part 1 refactor
//        for (int i = 0; i <= 100; i += 2){
//            System.out.println(i);
//        }
//1b Part 2 refactor
//        for ( int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//1b Part 3 refactor
//        for(long i = 2L; i <= 1000000; i = i * i){
//            System.out.println(i);
//        }

// 2.       Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//More specific needs to go first
//        for(int i = 1; i <= 100; i++){
//            System.out.println(i);
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println(i + "FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println(i + "Buzz");
//            } else if (i % 3 == 0){
//                System.out.println(i +"Fizz");;
//
//            }
//        }
//3.        Display a table of powers.

//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
////
        Scanner scanner = new Scanner(System.in);
//        String continueTable;
//        do {
//            System.out.print("Enter a integer: ");
//            int userInt = scanner.nextInt();
//            int squareNum;
//            int cubeNum;
//            System.out.println("  number    |   squared   |   cubed    ");
//            System.out.println("  -------   |   -------   |   -------  ");
//            for (int i = 1; i <= userInt; i++) {
//                squareNum = i * i;
//                cubeNum = i  * i * i;
//                System.out.printf("%-11d | %-11d | %d\n", i, squareNum, cubeNum);
//            }
//
//            System.out.println("Would you like to enter another integer? ");
//            continueTable = scanner.next();
//        } while (continueTable.equalsIgnoreCase("yes"));

// 4.       Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus

        boolean enterNewGrade;
            do {
                        System.out.println("What grade did you get?");
                        int grade = scanner.nextInt();
                        if (grade >= 88) {
                            System.out.println("You got an A.");
                        } else if (grade >= 80){
                            System.out.println("You got an B.");
                        } else if (grade >= 67){
                            System.out.println("You got an C.");
                        } else if (grade >= 60){
                            System.out.println("You got an D.");
                        } else {
                            System.out.println("You got an F.");
                        }
                        System.out.println("Do you have more grades to check?");
                        String userInput = scanner.next();
                        enterNewGrade = userInput.equalsIgnoreCase("yes");
                    } while (enterNewGrade);
//        } while (gradeValue.equalsIgnoreCase("yes"));
    }
}



