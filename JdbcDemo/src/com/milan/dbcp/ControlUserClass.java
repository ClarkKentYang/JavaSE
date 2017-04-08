package com.milan.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class ControlUserClass {
	
	@Test
	public void getUserById(){
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			conn = DbcpUtils.getConnection();
			String sql = "select * from t_user where id = ?";
			statement = conn.prepareStatement(sql);
			statement.setInt(1, 2);//之后可以替换为参数
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				System.out.println("用户名："+resultSet.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbcpUtils.releave(conn,statement,resultSet);
		}
	}
	
	
}
