package movies;
import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        String userAnswer;
        Scanner scanner = new Scanner(System.in);


        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("Enter a number 1-5");
            int answer = input.getInt();

            if (answer == 0) {
                System.out.println("Thank you! See you again next time.");
            } else if (answer == 1) {
                Movie.displayAllMovies(movies);
            } else if (answer == 2) {
                Movie.displaySelectedMoviesbyGenre(movies, "animated");
            } else if (answer == 3) {
                Movie.displaySelectedMoviesbyGenre(movies, "drama");
            } else if (answer == 4) {
                Movie.displaySelectedMoviesbyGenre(movies, "horror");
            } else if (answer == 5) {
                Movie.displaySelectedMoviesbyGenre(movies, "scifi");
            }
            System.out.println("Would you like to make another selection? Y for yes, N to exit");
            userAnswer = scanner.next();
            scanner.nextLine();
        } while (userAnswer.equalsIgnoreCase("Y"));
    }
}
