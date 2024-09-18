package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Chat;
import com.message.dominio.Mensaje;
import com.message.dominio.User;

public class ChatRepositorio 
{
    private UserRepositorio usuario;
	private MessageRepositorio mensaje;
	
	public ChatRepositorio() {
		usuario = new UserRepositorio();
		mensaje = new MessageRepositorio();
	}

	public UserRepositorio getUsuario() {
		return usuario;
	}

	public void setUsuario(UserRepositorio usuario) {
		this.usuario = usuario;
	}

	public MessageRepositorio getMensaje() {
		return mensaje;
	}

	public void setMensaje(MessageRepositorio mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int userId)
    {
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<User> contactos = usuario.getUsuarios();
		
		for(User l: contactos) 
        {
			if(l.getId() == userId)
				continue;
			
			Mensaje ultimoMsj = mensaje.getUltimoMsj(userId, l.getId());
			
			if(ultimoMsj == null)
				continue;
			
			User contacto = usuario.userId(l.getId());
			
			contactMsj.add(new Chat(contacto, ultimoMsj));
			
		}		
		
		return contactMsj;
		
	}

}
