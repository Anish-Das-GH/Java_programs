import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

            {
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
                    pstmt.setInt(1, 1);
                    pstmt.setString( 2, "Sales");
                    pstmt.setString( 3, "Akash Roy");
                    pstmt.executeUpdate();
//                    For Row 2
                    pstmt.setInt(1, 2);
                    pstmt.setString(2, "Marketing");
                    pstmt.setString( 3, "Aditya Sharma");

                    pstmt.executeUpdate();
                    System.out.println("Inserted....");

                    con.close();


                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }


            }
        }
}
