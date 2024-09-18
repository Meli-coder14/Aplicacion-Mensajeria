package com.message.gui;

import com.message.dominio.User;
import com.message.repositorio.UserListDao;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Top 
{
    private UserListDao usuario = new UserListDao();
	private Circle imagen;
	private Button logout;
	private Label nombre;
	private Label estado;
	private HBox topleft;
	private HBox topright;
	private User user;
	
	public Top(String username) {
		user =  usuario.userName(username);
		nombre = new Label(user.getNombre());
		imagen = new Circle(20);
		logout = new Button("Logout");
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
	}
	
	public Top() {
		imagen = new Circle(20);
		imagen.setStroke(Color.TRANSPARENT);
		imagen.setSmooth(true);
		topright = new HBox(10);
		topright.setStyle("-fx-padding: 6px 10px 0 10px;\r\n"
				+ "	-fx-pref-height: 61px;\r\n"
				+ "	-fx-alignment: center-left;\r\n"
				+ "	-fx-border-color: rgba(244,244,244,0.75)");
		topright.setAlignment(Pos.CENTER_LEFT);
	}

	public UserListDao getUsuario() {
		return usuario;
	}

	public void setUsuario(UserListDao usuario) {
		this.usuario = usuario;
	}

	public Circle getImagen() {
		return imagen;
	}

	public void setImagen(Circle imagen) {
		this.imagen = imagen;
	}

	public Button getLogout() {
		return logout;
	}

	public void setLogout(Button logout) {
		this.logout = logout;
	}

	public Label getNombre() {
		return nombre;
	}

	public void setNombre(Label nombre) {
		this.nombre = nombre;
	}

	public Label getEstado() {
		return estado;
	}

	public void setEstado(Label estado) {
		this.estado = estado;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public HBox getTopleft() {
		return topleft;
	}

	public void setTopleft(HBox topleft) {
		this.topleft = topleft;
	}

	public HBox getTopright() {
		return topright;
	}

	public void setTopright(HBox topright) {
		this.topright = topright;
	}

	public HBox topLeft() {
		imagen.setFill(new ImagePattern(new Image(user.getImagen())));
		topleft = new HBox(10, imagen, nombre, logout);
		topleft.setStyle("-fx-padding: 5px, 3px, 5px, 3px;\r\n"
				+ "	-fx-background-radius: 25px;\r\n"
				+ "	-fx-pref-height: 61px;\r\n"
				+ "	-fx-alignment: center-left;\r\n"
				+ "	-fx-border-color: rgba(244,244,244,0.75)	");
		topleft.setAlignment(Pos.CENTER);
		return topleft;
	}
	
	public HBox topRight(int userId) {
		user =  usuario.userId(userId);
		nombre = new Label(user.getNombre());
		nombre.setStyle("-fx-font-family: 'Comic Sans Ms';\r\n"
				+ "	-fx-text-fill: black;\r\n"
				+ "	-fx-font-weight: bold;\r\n"
				+ "	-fx-font-size: 130%;");
		estado = new Label(user.getEstado());
		estado.setStyle("-fx-font-family: 'Comic Sans Ms';\r\n"
				+ "	-fx-text-fill: black;\r\n"
				+ "	-fx-font-weight: normal;\r\n"
				+ "	-fx-font-size: 90%;");
		imagen.setFill(new ImagePattern(new Image(user.getImagen())));
		VBox vbox = new VBox(5, nombre, estado);
		topright.getChildren().addAll(imagen, vbox);
		return topright;
	}
	
	public void styles() {
		nombre.setStyle("-fx-font-family: 'Comic Sans Ms';\r\n"
				+ "	-fx-font-weight: bold;\r\n"
				+ "	-fx-font-size: 130%;\r\n"
				+ "	-fx-pref-width: 140px;\r\n"
				+ "	-fx-text-fill: black;");		
	}
	
}
