package com.ilp.ims.Util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost:3306/ims";
	static final String USERNAME="root";
	static final String PASSWORD="root";
	
	public static void closeConnection(Connection con) throws SQLException
	{
		if(con!=null)
		con.close();
	}
	
	public static void closeStatement(PreparedStatement ps) throws SQLException
	{
		if(ps!=null)
		ps.close();
	}
	
	public static void closeResultSet(ResultSet rs) throws SQLException
	{
		if(rs!=null)
		rs.close();
	}
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(DRIVER_NAME);
		Connection con=DriverManager.getConnection(URL, USERNAME,PASSWORD);
		return con;
	}
	

}
