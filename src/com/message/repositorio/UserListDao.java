package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.User;

public class UserListDao 
{
    private List<User> usuarios = new ArrayList<User>();
	
	public UserListDao() 
	{
		usuarios.add(new User(1, "Brando", "Herrera", "Brando45", "ImagUsu/Brando.jpeg", "Herrera4321", "En linea"));
		usuarios.add(new User(2, "Melissa", "Arias", "meli14", "ImagUsu/Melissa.jpeg", "meli1407", "En linea"));
		usuarios.add(new User(3, "Evelyn", "Rosales", "Evee12", "ImagUsu/Evelyn.jpeg", "rosales", "Desconectado"));
		usuarios.add(new User(4, "Domenica", "Ordoñez", "dome123", "ImagUsu/Domenica.jpeg", "ordoñez", "Desconectado"));
		usuarios.add(new User(5, "Cristhian", "Parrales", "cris12", "ImagUsu/Criss.jpeg", "cris10", "En Linea"));
		usuarios.add(new User(6, "Chirinos", "Chiriguaya", "chiri32", "ImagUsu/Chirinos.jpeg", "Eltragos", "En Linea"));
		usuarios.add(new User(7, "Garañon", "Tapia", "gara123", "ImagUsu/Tapia.jpeg", "Romeo", "En Linea"));
		usuarios.add(new User(8, "Potter", "Choez", "poterGaming", "ImagUsu/Potter.jpeg", "Fornite", "En Linea"));
		
	}
	
	public List<User> getUsuarios() 
	{
		return usuarios;
	}

	public User userId(int id) {
		for(User user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public User userName(String username) {
		for(User user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public User password(String username, String clave) {
		for(User user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
}
