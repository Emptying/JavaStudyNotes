package com.empty.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		//���ݿ�����
		Connection connection = null;
		//���ݿ����
		Statement statement = null;
		//���ݿ���
		ResultSet result = null;
		//ʹ��jdbc����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//�������ݿ�����
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","cws248337");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�������ݿ����
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�õ����ݿ���������
		try {
			statement.execute("delete from user where name='����'");
			result = statement.executeQuery("select * from user");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//
		try {
			while(result.next()){
				System.out.print("ID:"+result.getInt("ID")+" ");
				System.out.print("����:"+result.getString("name")+" ");
				System.out.print("����:"+result.getString("password")+" ");
				System.out.println("����:"+result.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				connection.close();
				statement.close();
				result.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
