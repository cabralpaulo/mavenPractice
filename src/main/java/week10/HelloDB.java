package week10;

import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:hello1.sqlite";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        //Table Creation
        String createTableSQL = "CREATE TABLE IFS NOT EXISTS cats (name TEXT, age INTEGER)"; //Table can run if it already exists.
        statement.execute(createTableSQL);
        //Adding object to the table
        String insertDataSQL = "INSERT INTO cats VALUES ('Maru', 10)";
        statement.execute(insertDataSQL);

        insertDataSQL = "INSERT INTO cats VALUES('Hello Kitty', 40)";
        statement.execute(insertDataSQL);

        insertDataSQL = "INSERT INTO cats VALUES('Garfield', 41)";
        statement.execute(insertDataSQL);

        insertDataSQL = "INSERT INTO cats VALUES ('Sowball', 12)";
        statement.execute(insertDataSQL);

        String getAllDataSQL = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllDataSQL);

        while (allCats.next()){
            String name = allCats.getString("name");
            int age = allCats.getInt("age");
            System.out.println((name +  " is " + age + " years old"));
        }
        allCats.close();
        //Close result set when done using it.

        String dropTableSql = "DROP TABLE cats"; //Delete - drop - the cats table
        //statement.execute(dropTableSql); //Execute drop table statement

        statement.close();
        connection.close();

    }
}
