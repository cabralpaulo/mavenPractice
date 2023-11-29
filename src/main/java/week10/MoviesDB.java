package week10;

import java.sql.*;

public class MoviesDB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:MoviesDB:List";

        Connection connection = DriverManager.getConnection(url); //Connecting with the DB
        Statement statement = connection.createStatement();

        String createTableMovies = "CREATE TABLE IF NOT EXISTS movies (name TEXT, rating INTEGER, watched BOOLEAN)";
        statement.execute(createTableMovies); //Creating the table

        String DataSQL = "INSERT INTO movies VALUES ('Napoelon',0 , false)";
        statement.execute(DataSQL);

        DataSQL = "INSERT INTO movies VALUES ('Oppenheimer',4 , true)";
        statement.execute(DataSQL);

        String getAllDataSQL = "SELECT * FROM movies";
        ResultSet allMovies = statement.executeQuery(getAllDataSQL);

        while (allMovies.next()){
            String name = allMovies.getString("name");
            int rating = allMovies.getInt("rating");
            boolean watched = allMovies.getBoolean("Watched");
            System.out.println( name + " Ratings: " + rating + " Watched: " + watched);
        }

        connection.close();
    }

}
