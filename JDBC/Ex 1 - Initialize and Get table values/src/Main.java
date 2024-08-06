import java.net.StandardSocketOptions;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

//        MYSQL DETAILS
        String url="jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "anish12";
//        FETCHING DRIVER OF JDBC
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("driver loeaded Sucessfully");

                }
                catch(ClassNotFoundException e)
                {
                    System.out.println(e.getMessage());
                }
//                ESTABLISHING CONNECTION
                try(Connection connection = DriverManager.getConnection(url,username,password))
                {
                    System.out.println("Connected to the database");
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery("Select * from emp");
//                    GETTING DATA FROM DATABASE FOR ALL ROWS
                    while(rs.next())
                    {
                        System.out.println("=============");
                        int id =  rs.getInt("id");
                        String name = rs.getString("name");
                        String job_title = rs.getString("job_title");
                        double salary = rs.getDouble("Salary");

                        System.out.println("ID :"+id);
                        System.out.println("name :"+name);
                        System.out.println("job_title:"+job_title);
                        System.out.println("salary :"+salary);

                    }
                }
                catch(SQLException e)
                {
                    System.err.println("Connection Failed" + e.getMessage());
                }
    }
}