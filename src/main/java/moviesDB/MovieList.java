package moviesDB;

import static input.InputUtils.*;

public class MovieList {

    private static final String DB_PATH = "jdbc:sqlite:movie:watchlist.sqlite";
    private static Database database;
    public static void main(String[] args) {
        database = new Database(DB_PATH);
        addNewMovie();
    }

    public static void addNewMovie() {
        do{
            String movieName = stringInput("Enter  a movie name: ");
            boolean movieWatched = yesNoInput("Have you watched this movie yet?");
            int movieStars = 0;
            if(movieWatched) {
                movieStars = positiveIntInput("What your rating in stars out of 5?");
                //todo add validation number between 0 to 5
            }
            Movie movie = new Movie (movieName, movieStars, movieWatched);
            database.addNewMovie(movie);


        } while (yesNoInput("Add New Movie to the watchlist?"));
    }
}
