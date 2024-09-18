package com.message.dominio;

import java.time.LocalDateTime;

public class Mensaje 
{
    private int id;
	private User usuario1;
	private User usuario2;
	private LocalDateTime fecha;
	private String mensaje;
	
	public Mensaje(int id, User usuario1, User usuario2, LocalDateTime fecha, String mensaje) {
		this.id = id;
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
		this.fecha = fecha;
		this.mensaje = mensaje;
	}

	//#region GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(User usuario1) {
		this.usuario1 = usuario1;
	}

	public User getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(User usuario2) {
		this.usuario2 = usuario2;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	} 
	//#endregion   
}
