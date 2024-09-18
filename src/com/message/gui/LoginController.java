package com.message.gui;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LoginController 
{
    private AnchorPane anchorPane;
	private Button btnIniciar;
	private Button btnRegresar;
	private HBox hbox1;
	private HBox hbox2;
	private ImageView ImgIconoLogin;
	private Label lblTitulo;
	private Label lblClave;
	private Label lblUser;
	private Label lblAlerta;
	private PasswordField pswClave;
	private TextField txtUser;
	private VBox vbox1;
	private VBox vbox2;
	
	
	
	public LoginController() 
	{
		lblTitulo = new Label("MebraCrisApp ");
		lblTitulo.setFont(new Font(39));
		lblTitulo.setTextFill(Color.WHITE);
		lblTitulo.setStyle("-fx-font-family: 'Comic Sans Ms';");
		
		ImgIconoLogin = new ImageView(new Image("ImagLogin/Mensajero.png"));
		ImgIconoLogin.setFitWidth(125);
		ImgIconoLogin.setFitHeight(100);
		ImgIconoLogin.setPreserveRatio(true);
		ImgIconoLogin.setSmooth(true);
		ImgIconoLogin.setCursor(Cursor.HAND);

		lblUser = new Label("User-Name:");
		lblUser.setFont(new Font(18));
		lblUser.setTextFill(Color.WHITE);
        lblUser.setStyle("-fx-font-family: 'Comic Sans Ms'; -fx-font-weight: bold;");

		txtUser = new TextField();
		txtUser.setStyle("-fx-background-Color: transparent; -fx-border-Color: Black; -fx-border-width: 0px 0px 2px 0px;");
		txtUser.setMaxWidth(250);

		lblClave = new Label("Password:");
		lblClave.setFont(new Font(18));
		lblClave.setTextFill(Color.WHITE);
        lblClave.setStyle("-fx-font-family: 'Comic Sans Ms'; -fx-font-weight: bold;");
		
		pswClave = new PasswordField();
		pswClave.setStyle("-fx-background-Color: transparent; -fx-border-Color: Black; -fx-border-width: 0px 0px 2px 0px;");
		pswClave.setMaxWidth(250);
        pswClave.setVisible(true);

		btnIniciar = new Button("INGRESAR");
		btnIniciar.setCursor(Cursor.HAND);
        btnIniciar.setStyle("-fx-background-color: transparent; -fx-border-Color: White");
        btnIniciar.setTextFill(Color.WHITE);
		
        btnIniciar.setFont(new Font(12));
        btnIniciar.setPrefWidth(100);
        btnIniciar.setPrefHeight(34);
		

		lblAlerta = new Label();
		lblAlerta.setStyle("-fx-font-weight: normal;\r\n" + "-fx-font-family: 'Comic Sans Ms';\r\n" + "-fx-font-size: 150%;\r\n" + "-fx-text-fill: rgb(0,0,0);");

		btnRegresar = new Button("Regresar");
		btnRegresar.setCursor(Cursor.HAND);
		btnRegresar.setStyle("-fx-background-color: #008B8B;");
		btnRegresar.setFont(new Font(10));
		btnRegresar.setPrefWidth(80);
        btnRegresar.setPrefHeight(34);
		btnRegresar.setTextFill(Color.WHITE);
		
		hbox1 = new HBox(50);
		hbox2 = new HBox(30);
		vbox1 = new VBox(30);;
		
		anchorPane = new AnchorPane();
		anchorPane.setStyle("-fx-background-color: #008B8B; ");

		
	}


	//#region GETTERS AND SETTERS
	
	public AnchorPane getAnchorPane() {
		return anchorPane;
	}

	public void setAnchorPane(AnchorPane anchorPane) {
		this.anchorPane = anchorPane;
	}

	public Button getBtnIniciar() {
		return btnIniciar;
	}

	public void setBtnIniciar(Button btnIniciar) {
		this.btnIniciar = btnIniciar;
	}

	public Button getBtnRegresar() {
		return btnRegresar;
	}

	public void setBtnRegresar(Button btnRegresar) {
		this.btnRegresar = btnRegresar;
	}

	public HBox getHbox1() {
		return hbox1;
	}

	public void setHbox1(HBox hbox1) {
		this.hbox1 = hbox1;
	}

	public HBox getHbox2() {
		return hbox2;
	}

	public void setHbox2(HBox hbox2) {
		this.hbox2 = hbox2;
	}

	public ImageView getImgIconoLogin() {
		return ImgIconoLogin;
	}

	public void setImgIconoLogin(ImageView imgIconoLogin) {
		ImgIconoLogin = imgIconoLogin;
	}

	public Label getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(Label lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public Label getLblClave() {
		return lblClave;
	}

	public void setLblClave(Label lblClave) {
		this.lblClave = lblClave;
	}

	public Label getLblUser() {
		return lblUser;
	}

	public void setLblUser(Label lblUser) {
		this.lblUser = lblUser;
	}

	public Label getLblAlerta() {
		return lblAlerta;
	}

	public void setLblAlerta(Label lblAlerta) {
		this.lblAlerta = lblAlerta;
	}

	public PasswordField getPswClave() {
		return pswClave;
	}

	public void setPswClave(PasswordField pswClave) {
		this.pswClave = pswClave;
	}

	public TextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(TextField txtUser) {
		this.txtUser = txtUser;
	}

	public VBox getVbox1() {
		return vbox1;
	}

	public void setVbox1(VBox vbox1) {
		this.vbox1 = vbox1;
	}

	public VBox getVbox2() {
		return vbox2;
	}

	public void setVbox2(VBox vbox2) {
		this.vbox2 = vbox2;
	}

	//#endregion
	

	public void contenidoVbox1() 
	{		
		hbox1.getChildren().addAll(lblUser);
		hbox1.getChildren().addAll(txtUser);
		hbox2.getChildren().addAll(lblClave);
		hbox2.getChildren().addAll(pswClave);
		vbox1.getChildren().addAll(hbox1, hbox2);		
	}
	
	public VBox contenidoVbox2() {
		vbox2 = new VBox(13, lblAlerta, btnRegresar);
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setId("vbox");
		return vbox2;
	}
	
	public void notificar(String username, String password) 
	{
		if(username.equals("") || password.equals(""))
			lblAlerta.setText("Alerta!!!, campos vacios");
		else
			lblAlerta.setText("Datos incorrectos, Por favor ingrese bien los datos");	
	}
	
	public AnchorPane anchor() {
		anchorPane.getChildren().addAll(lblTitulo, ImgIconoLogin, vbox1, btnIniciar);
		AnchorPane.setLeftAnchor(lblTitulo, 150d);
    	AnchorPane.setTopAnchor(lblTitulo, 80d);
    	AnchorPane.setTopAnchor(ImgIconoLogin, 40d);
    	AnchorPane.setLeftAnchor(ImgIconoLogin, 420d);
    	AnchorPane.setLeftAnchor(btnIniciar, 240d);
    	AnchorPane.setBottomAnchor(btnIniciar, 70d);
    	AnchorPane.setLeftAnchor(vbox1, 150d);
    	AnchorPane.setTopAnchor(vbox1, 195d);
		
    	return anchorPane;
	}
	
}
