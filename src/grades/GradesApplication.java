package grades;

import java.util.HashMap;

import util.Input;
import java.util.Scanner;



public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> student = new HashMap<>();

        Student student2 = new Student("Aniya");
        student2.addGrade(50);
        student2.addGrade(100);
        student2.addGrade(96);

        Student student3 = new Student("Elexius");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);

        Student student4 = new Student("Jaylen");
        student4.addGrade(98);
        student4.addGrade(22);
        student4.addGrade(75);

        Student student5 = new Student("Noah");
        student5.addGrade(100);
        student5.addGrade(100);
        student5.addGrade(99);

        //put github names on student

        student.put("Niya11", student2);
        student.put("LexFlex", student3);
        student.put("Jay123", student4);
        student.put("TktheTHIRD", student5);

        //GETTING AVAERAGE USING GITHUB NAMES
        System.out.println(student.get("LexFlex").getGradeAverage());

        System.out.println("Welcome to Code Academy! Here's a list of our current students:");
        System.out.println("|Niya11| |Jay123| |LexFlex |TktheTHIRD\"|");

        Scanner scanner = new Scanner(System.in);

        String toContinue;
        String toAnswer;
        do {
            System.out.println("What student would you like to see more information on?\n");
            String userInput = scanner.nextLine();
            System.out.println("Name: " + student.get(userInput).getName() + " - GitHub Username: " + userInput );


            System.out.println("Would you like to view another student? (yes/no)");
            toContinue = scanner.next();
            scanner.nextLine();

            System.out.println("What student would you like to see more information on?\n");
            scanner.nextLine();
            System.out.println("Current Average: " + student.get(userInput).getGradeAverage());;
            System.out.println("Name: " + student.get(userInput).getName() + " - GitHub Username: " + userInput );


        }while(toContinue.equals("yes"));





    }
}
