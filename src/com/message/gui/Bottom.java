package com.message.gui;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class Bottom 
{
    private TextField texto;
	private Button boton;
	private HBox hbox;
	
	public Bottom() 
	{
		texto = new TextField();
		Image imgSend = new Image(("Imag/Enviar.png"));
        ImageView imgSend2 = new ImageView(imgSend);
        imgSend2.setFitHeight(22);
        imgSend2.setFitWidth(25);
		boton = new Button("" , imgSend2);
		boton.setCursor(Cursor.HAND);
		
		hbox = new HBox(5, texto, boton);
	}
	
	public TextField getTexto() {
		return texto;
	}

	public void setTexto(TextField texto) {
		this.texto = texto;
	}

	public Button getBoton() {
		return boton;
	}

	public void setBoton(Button boton) {
		this.boton = boton;
	}

	public HBox getHbox() {
		return hbox;
	}

	public void setHbox(HBox hbox) {
		this.hbox = hbox;
	}
	
	public void styles() {
		texto.setStyle("-fx-pref-width: 620px;\r\n"
				+ "	-fx-pref-height: 30px;\r\n"
				+ "	-fx-font-weight: normal;\r\n"
				+ "	-fx-font-family: 'Comic Sans Ms';\r\n"
				+ "	-fx-font-size: 120%;\r\n"
				+ "	-fx-focus-traversable: false;");
		
		boton.setStyle("-fx-pref-width: 70px;\r\n"
				+ "	-fx-pref-height: 29px;");
		
		hbox.setStyle("-fx-padding: 0 2px 0 2px;\r\n"
				+ "	-fx-pref-height: 45px;\r\n"
				+ "	-fx-alignment: center;");
	}    
}
