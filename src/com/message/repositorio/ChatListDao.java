package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Chat;
import com.message.dominio.Mensaje;
import com.message.dominio.User;

public class ChatListDao 
{
    private UserListDao usuario;
	private MessageListDao mensaje;
	
	public ChatListDao() {
		usuario = new UserListDao();
		mensaje = new MessageListDao();
	}

	public UserListDao getUsuario() {
		return usuario;
	}

	public void setUsuario(UserListDao usuario) {
		this.usuario = usuario;
	}

	public MessageListDao getMensaje() {
		return mensaje;
	}

	public void setMensaje(MessageListDao mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int userId){
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<User> contactos = usuario.getUsuarios();
		
		for(User l: contactos) {
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
