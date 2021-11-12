import java.util.Scanner;

public class Bob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String isCont;
        System.out.println("Would you like to talk to bob?");
        String userInput = scanner.next();
        scanner.nextLine();
        do{
            System.out.println("Ask something");
            String userToBob = scanner.nextLine();
            if (userToBob.endsWith("?")){
                System.out.println("Sure");
            }else if (userToBob.endsWith("!")){
                System.out.println("Whoa, chill");
            }else if(userToBob.equals("")){
                System.out.println("Fine be that way");
            }else{
                System.out.println("Whatever");
            }
            System.out.println("Would you like to ak another question? (yes/no)");
            isCont = scanner.next();
            scanner.nextLine();
        }while (isCont.equalsIgnoreCase("yes"));
    }
}
