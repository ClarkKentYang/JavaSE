package com.milan.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///miaowang","root","root");
			//设置是否自动提交事务
			connection.setAutoCommit(false);
			
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("insert into t_user values(null,'abcde',null,null,null,null,null,null)");
			
			//提交事务
			connection.commit();
			
			connection.close();
			statement.close();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}
}
