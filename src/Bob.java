import java.util.Scanner;
public class Bob {
    public static void main(String[] args){

//2.        Create a class named Bob with a main method for the following exercise.
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you want to talk to bob?");
        String userAnswer;

        do {

            System.out.println("Ask bob a question:");
            String userToBob = scanner.nextLine();

            if (userToBob.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userToBob.endsWith("!")) {
                System.out.println("Whoa! Chill out!");
            } else if (userToBob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println(("Whatever."));
            }
            System.out.println("Would you like to continue?(yes/no)");
            userAnswer = scanner.next();
            scanner.nextLine();
        }while(userAnswer.equals("yes"));

    }
}
