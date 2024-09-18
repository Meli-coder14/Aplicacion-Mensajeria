package com.message.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.User;

public class UserRepositorio 
{
    private User usuario;
	private String url;
	private String user;
	private String clave;
	
	public UserRepositorio() 
    {
		url = "jdbc:postgresql://localhost:5432/base_chat";
		user = "postgres";
		clave = "crispa15";
	}
	
	public List<User> getUsuarios()
    {
		List<User> usuarios = new ArrayList<User>();
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios";			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuarios.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			connect.close();			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public User userId(int id) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where usuarioId = " + id;			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;		
	}
	
	public User userName(String username) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where username = '" + username + "'";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public User password(String username, String password) {	
		try {
			Connection connect = DriverManager.getConnection(url, user, clave);
			Statement stm = connect.createStatement();
			String query = "select * from usuarios where username = '" + username + "' and clave = '" + password + "'";
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				usuario = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		return usuario;
	}
}
