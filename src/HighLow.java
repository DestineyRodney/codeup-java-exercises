import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {

        //Generate random number between 1 and 100
        int number = 1 + (int) (Math.random() * 100);
        System.out.println(number);

        System.out.println("Pick  a number between 1 and 100:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println(userInput);



        if (userInput < number){
            System.out.println("HIGHER");
        } else if (userInput > number){
            System.out.println("LOWER");
        }else{
            System.out.println("GOOD GUESS");
        }

    }
    
}
