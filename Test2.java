package jdbcApp;

import java.sql.*;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception{
		String clas, name;
		int roll;
		
		Scanner o=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=o.nextLine();
		System.out.println("Enter Roll_no : ");
		roll=o.nextInt();
		System.out.println("Enter class : ");
	  o.nextLine();
		clas=o.nextLine();
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/guu?useSSL=false", "root", "ravi123");
  PreparedStatement ps= con.prepareStatement("Insert into stu values(?,?,?)");
  ps.setString(1, name);
  ps.setInt(2, roll);
  ps.setString(3, clas);
 
    int i=ps.executeUpdate();
    if(i>0) {
    	System.out.println("Succues");
    }
    else {
    	System.out.println("fail");
    }
    ps.close();
    con.close();
	}

}
