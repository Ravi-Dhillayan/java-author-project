package jdbcApp;

import java.sql.*;
import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
	
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gu?useSSL=false", "root", "ravi123");
			Statement stmt = con.createStatement();
			String name;
			int id,sal;
			System.out.println("Enter the new Id Name and Salary");
			Scanner o=new Scanner(System.in);
			id=o.nextInt();
			name=o.nextLine();
			sal=o.nextInt();
			PreparedStatement ps=con.prepareStatement("insert int employee values('"+id+"'"
					+ ",'"+name+"''"+sal+"')");
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Success : ");
			}
			else {
				System.out.println("fail");
			}
		String sql = "delete from employee where id=404";
	        stmt.executeUpdate(sql);
			/*
		
			//con.commit();
			*/
			/*
			String sql = "delete from employee where id=404";
	        stmt.executeUpdate(sql);
	        */
//			String sqal = "INSERT INTO employee VALUES (404, 'Zaid', 30000)";
//	        stmt.executeUpdate(sqal);
//			String sql = "update employee set name ='Ravi kumar' where id=101";
//	        stmt.executeUpdate(sql);
//			ResultSet rs = stmt.executeQuery("select * from employee");
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
//			
//		
//	
			con.close();
	}
}