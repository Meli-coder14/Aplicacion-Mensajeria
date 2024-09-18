package com.message.dominio;

public class Chat 
{
    private User usuario;
	private Mensaje mensaje;
	
	public Chat(User usuario, Mensaje mensaje) {
		this.usuario = usuario;
		this.mensaje = mensaje;
	}

	// GETTERS AND SETTERS
	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}    
}
