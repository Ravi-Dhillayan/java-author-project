package jdbcApp;
import java.sql.*;
import java.util.Scanner;

class Test3 {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gu?useSSL=false", "root", "ravi123");
        Statement stmt = con.createStatement();

        String name;
        int id, sal;
        System.out.println("Enter the new Id, Name and Salary:");
        Scanner o = new Scanner(System.in);
        id = o.nextInt();
        o.nextLine(); // Consume the newline
        name = o.nextLine();
        sal = o.nextInt();

        // Use a prepared statement to insert data
        PreparedStatement ps = con.prepareStatement("INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, sal);

        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("Success: Record inserted successfully");
        } else {
            System.out.println("Fail: Record insertion failed");
        }

        // Example SQL statements
        String sql = "DELETE FROM employee WHERE id=404";
        stmt.executeUpdate(sql);

        // Uncomment if you want to execute other statements
        // String sqal = "INSERT INTO employee VALUES (404, 'Zaid', 30000)";
        // stmt.executeUpdate(sqal);

        // String sqlUpdate = "UPDATE employee SET name ='Ravi kumar' WHERE id=101";
        // stmt.executeUpdate(sqlUpdate);

        // Uncomment to fetch and display records
        // ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
        // while (rs.next()) {
        //     System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
        // }

        con.close();
        o.close();
    }
}

