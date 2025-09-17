import java.util.*;

class Movie {
    private String title;
    private String director;
    private int year;
    private String genre;

    // Constructor
    public Movie(String title, String director, int year, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getYear() { return year; }
    public String getGenre() { return genre; }

    // Display movie details
    public void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("----------------------");
    }
}

class MovieDatabase {
    private List<Movie> movies;

    public MovieDatabase() {
        movies = new ArrayList<>();
    }

    // Add new movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Search by title
    public void searchMovie(String title) {
        boolean found = false;
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                m.displayMovie();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Movie not found!");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the database.");
            return;
        }
        for (Movie m : movies) {
            m.displayMovie();
        }
    }
}



public class MovieDatabaseApp {
     public static void main(String[] args) {
        MovieDatabase db = new MovieDatabase();

        // Adding movies
        db.addMovie(new Movie("Inception", "Christopher Nolan", 2010, "Sci-Fi"));
        db.addMovie(new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action"));
        db.addMovie(new Movie("Interstellar", "Christopher Nolan", 2014, "Sci-Fi"));

        // Display all movies
        System.out.println("All Movies:");
        db.displayAllMovies();

        // Search a movie
        System.out.println("Searching for 'Inception':");
        db.searchMovie("Inception");

        System.out.println("Searching for 'Avatar':");
        db.searchMovie("Avatar");
}


    
}
