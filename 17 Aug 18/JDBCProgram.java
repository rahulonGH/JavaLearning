package git.Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) {
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver"); //registration of driver  {if ojdbc14.jar file is not added, ClassNotFoundException will be thrown}
			oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			System.out.println(DriverManager.getLoginTimeout());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","wlsysadmin"); //Creating Connection
			System.out.println(con.getAutoCommit());
			Statement stmt = con.createStatement(); //creating statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); //executing the query
			while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); //getting values  based on column Index
			}
			System.out.println("----------------------------------");
			
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM EMP"); //executing the query
			while(rs1.next()){
				System.out.println(rs1.getInt("ID")+"  "+rs1.getString("Name")+"  "+rs1.getInt("Salary"));  //getting values  based on column name
			}
			con.close();//closing the connection
			
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
