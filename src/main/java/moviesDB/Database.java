package moviesDB;

import java.sql.*;

public class Database {

    private String databasePath;

    Database(String databasePath){ //Constructor
        //Create a table, or make sure it's created

        try(Connection connection = DriverManager.getConnection(databasePath); //Connection
        Statement statement = connection.createStatement() ){

        //Create table
            this.databasePath = databasePath;

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "movies (name text, stars INTEGER, watched BOOLEAN)");


        } catch (SQLException e) {
            System.out.println("Error creating movies DB table" + e);
        }
    }

    public void addNewMovie(Movie movie) {

        String insertSQL = "INSERT INTO movies VALUES(?,?,?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)){
            //Insert Movies
            //todo add movie
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();

            } catch (SQLException e) {
            System.out.println("Error adding the movie " + movie + "because " + e);
        }
    }
}
