
// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

// Student class representing the entity
class Student {

    private String studentName;
    private int rollNumber;
    private String className;

    // Constructors, getters, and setters can be added as needed

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", className='" + className + '\'' +
                '}';
    }
}

// DatabaseConnection class to handle database interactions
class DatabaseConnection {

    // JDBC URL for Oracle DB
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USERNAME = "your_username"; // Replace with your actual username
    private static final String PASSWORD = "your_password"; // Replace with your actual password

    // Insert student data into the database
    public static void insertStudent(Student student) {
        // SQL query to insert student data
        String sql = "INSERT INTO students VALUES(?, ?, ?)";

        // Connection class object
        Connection con = null;

        // Try block to check for exceptions
        try {
            // Registering drivers
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            // Reference to connection interface
            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Creating a prepared statement
            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                // Setting parameters for the query
                preparedStatement.setString(1, student.getStudentName());
                preparedStatement.setInt(2, student.getRollNumber());
                preparedStatement.setString(3, student.getClassName());

                // Executing the query
                int affectedRows = preparedStatement.executeUpdate();

                // Checking the result of the insertion
                if (affectedRows > 0) {
                    System.out.println("Inserted successfully: " + student);
                } else {
                    System.out.println("Insertion failed");
                }
            }

            // Closing the connection
            con.close();
        } catch (Exception ex) {
            // Display message when exceptions occur
            System.err.println(ex);
        }
    }
}

// Main class
public class StudentDataInsertion {

    // Main driver method
    public static void main(String[] args) {

        // Entering student data
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.next();

        System.out.println("Enter roll number:");
        int roll = scanner.nextInt();

        System.out.println("Enter class:");
        String cls = scanner.next();

        // Creating a Student object
        Student student = new Student();
        student.setStudentName(name);
        student.setRollNumber(roll);
        student.setClassName(cls);

        // Inserting student data into the database
        DatabaseConnection.insertStudent(student);
    }
}
