package com.milan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJdbc {

	
	@Test
	public void testJunit(){
		System.out.println("test junit success!");
	}
	
	@Before
	public void before(){
		System.out.println("before method");
	}
	
	
	@After
	public void after(){
		System.out.println("after method");
	}
	
	@Test
	public void testJdbc() throws ClassNotFoundException, SQLException{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miaowang", "root", "root");
		//创建执行sql语句的对象
		Statement statement = connection.createStatement();
		//sql语句
		String sql = "select * from t_user";
		//执行sql语句
		ResultSet resultSet = statement.executeQuery(sql);
		//对结果集进行处理
		while (resultSet.next()) {
			System.out.println(resultSet.getString("username"));
		}
	} 
	
	@Test
	public void getUser() throws ClassNotFoundException, SQLException{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miaowang", "root", "root");
		//sql语句
		String sql = "select * from t_user where username = ?";
		//创建预处理对象
		PreparedStatement statement = connection.prepareStatement(sql);
		//设置参数
		statement.setString(1, "admin");
		//执行查询操作
		ResultSet resultSet = statement.executeQuery();
		//对结果集进行处理
		while (resultSet.next()) {
			System.out.println(resultSet.getString("username"));
		}
	} 
	
}
