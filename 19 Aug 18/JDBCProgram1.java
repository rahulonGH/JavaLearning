package git.Learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram1 {

	public static void main(String[] args) {
		try {
			oracle.jdbc.driver.OracleDriver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","wlsysadmin"); //Creating Connection
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Statement st1 = con.createStatement();
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
			pst.setInt(1, 1005);
			pst.setString(2, "RAMESH");
			pst.setInt(3, 8004);
			pst.executeUpdate();
			
			/*int no_of_rows_affected = st1.executeUpdate("insert into emp values(1003,'RAMU',8233)");
			System.out.println(no_of_rows_affected+" rows affected.");*/
			
			ResultSet rs = st.executeQuery("Select * from EmP");
			ResultSet rs1 = st1.executeQuery("Select * from EmP");
			/* check scrollability of resultset*/
			if(rs1.getType() == ResultSet.TYPE_FORWARD_ONLY)
				System.out.println("Non-Scrollable");
			else
				System.out.println("Scrollable");
			
			rs.last();
			 while(!rs.isBeforeFirst()){
				 System.out.println(rs.getInt("ID")+"  "+rs.getString("Name")+"  "+rs.getInt("Salary"));  //getting values  based on column name
				 rs.previous();
			 }
			 rs.close();
			 rs1.close();
			 st.close();
			 st1.close();
			 con.close();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			
		}
	}

}
