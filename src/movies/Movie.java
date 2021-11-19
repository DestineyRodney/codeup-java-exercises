package movies;
import java.util.Arrays;

public class Movie {
    private String name;
    private String category;
//constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
//getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

//    setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public static void displayAllMovies(Movie[] movies) {
        for (Movie movie : movies) {
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
    }

    public static void displaySelectedMoviesbyGenre(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), category);
            }
        }
    }
}
