package database.programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JDBCProgram {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver class

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "ARPIT"); // Connection
																												// url,
																												// Username,
																												// Password

		Statement stm = con.createStatement();
		ResultSet eq = stm.executeQuery("SELECT * FROM DEPT");

		while (eq.next()) {
			System.out.println(eq.getInt(1) + " " + eq.getString(2) + " " + eq.getString(3));
			// System.out.println(eq.getInt(1)+" "+eq.getString(2)+" "+eq.getString(3));
		}

		stm.close();
		con.close();
	}
}
