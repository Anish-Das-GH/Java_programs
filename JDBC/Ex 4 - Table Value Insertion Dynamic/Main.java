import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

            {
                Scanner sc = new Scanner(System.in);
                String url = "jdbc:mysql://localhost:3306/employees";
                String username = "root";
                String password = "anish12";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("driver loeaded Sucessfully");

                } catch (ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }

                String query = "Insert into Department (Dept_id,Dept_name,Dept_manager)values(?,?,?)";
                try {

                    Connection con = DriverManager.getConnection(url, username, password);
                    System.out.println("Connection success");

                    PreparedStatement pstmt = con.prepareStatement(query);
//                    For Row 1
                    System.out.println("Enter Department id...");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Department name...");
                    String dname = sc.nextLine();
                    System.out.println("Enter Department Manager...");
                    String dman = sc.nextLine();

                    pstmt.setInt(1, id);
                    pstmt.setString( 2, dname);
                    pstmt.setString( 3, dman);
                    pstmt.executeUpdate();



                    System.out.println("Inserted....");

                    con.close();


                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }


            }
        }
}
