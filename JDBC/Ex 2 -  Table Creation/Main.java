
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        {
            String url = "jdbc:mysql://localhost:3306/employees";
            String username = "root";
            String password = "anish12";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("driver loeaded Sucessfully");

            }
            catch(ClassNotFoundException e)
            {
                System.out.println(e.getMessage());
            }

            String query = "Create Table Department(Dept_id int(10),Dept_name varchar(20),Dept_Manager varchar(20))";
            try{

               Connection con =   DriverManager.getConnection(url,username,password);
               System.out.println("Connection success");
               Statement stmt = con.createStatement();
               stmt.execute(query);
               System.out.println("Table Created ....");
               con.close();


            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }



        }
    }
}
