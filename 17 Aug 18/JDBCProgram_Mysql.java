package git.Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram_Mysql {

	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver"); //registration of driver  {if com.mysql.jdbc_5.1.5.jar file is not added, ClassNotFoundException will be thrown}
			Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver  {if mysql-connector-java-8.0.12.jar [latest jar as on 17 Aug 2018 for mysql8.0.12.0] file is not added, ClassNotFoundException will be thrown}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_app","system","wlsysadmin"); //Creating Connection
			Statement stmt = con.createStatement(); //creating statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); //executing the query
			while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); //getting values  based on column Index
			}
			System.out.println("----------------------------------");
			
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM EMP"); //executing the query
			while(rs1.next()){
				System.out.println(rs1.getInt("empid")+"  "+rs1.getString("empname")+"  "+rs1.getInt("Salary"));  //getting values  based on column name
			}
			con.close();//closing the connection
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
