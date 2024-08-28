import java.sql.*;

public class Main {
  public static void main(String[] args) throws SQLException {

    // Step 1: Load the Driver
    //Class.forName("jdbc:mysql.jdbc.Driver");

    // Step 2: Create Connection Object
    String url = "jdbc:mysql://localhost:3306/demo";
    String username = "root";
    String password = "groot";
    Connection connection = DriverManager.getConnection(url, username, password);


    // Step 3: Create Statement Object
    Statement statement = connection.createStatement();


    // Exercise 1: get data from database
    // Step 4: Execute Query
//        String sql = "Select * from employee";
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next()) {
//            System.out.println("Id: " + resultSet.getInt(1) + ", Name: "
//                    + resultSet.getString(2) + ", Email: "
//                    + resultSet.getString(3));
//        }

    // Exercise 2: insert employee
    String query = "insert into employee (name, email) values (?, ?)";
    // get preparedStatement object
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    // set the values in query
    preparedStatement.setString(1, "john");
    preparedStatement.setString(2, "j@gmail.com");
    // execute query
    int rowAffected = preparedStatement.executeUpdate();
    System.out.println("("+rowAffected+") rows affected");



    // Exercise 3: update employee




    // Exercise 4: delete employee


    // Step 5: Close the Connection
    connection.close();
  }
}