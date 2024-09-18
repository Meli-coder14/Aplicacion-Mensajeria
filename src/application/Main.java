package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.message.dominio.Chat;
import com.message.dominio.Mensaje;
import com.message.dominio.User;
import com.message.gui.Bottom;
import com.message.gui.LoginController;
import com.message.gui.msjDiseno;
import com.message.gui.Right;
import com.message.gui.LoginTwoController;
import com.message.gui.Top;
import com.message.repositorio.ChatListDao;
import com.message.repositorio.MessageListDao;
import com.message.repositorio.UserListDao;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {
	UserListDao usuarios = new UserListDao();
	MessageListDao mensajes = new MessageListDao();
	ChatListDao chats = new ChatListDao();

	@Override
	public void start(Stage stage1) throws Exception {
		LoginController firstgui = new LoginController();
		firstgui.contenidoVbox1();
		Scene scene1 = new Scene(firstgui.anchor(), 600, 500);
		stage1.getIcons().add(new Image("ImagLogin/Mensajero.png"));
		scene1.getStylesheets().add(String.valueOf(this.getClass().getResource("application.css")));
		stage1.setTitle("MebracrisApp");
		stage1.setResizable(false);
		stage1.setScene(scene1);
		stage1.show();

		firstgui.getBtnIniciar().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (usuarios.password(firstgui.getTxtUser().getText(), firstgui.getPswClave().getText()) == null) {
					firstgui.notificar(firstgui.getTxtUser().getText(), firstgui.getPswClave().getText());

					stage1.close();
					Stage stage2 = new Stage();
					Scene scene2 = new Scene(firstgui.contenidoVbox2(), 400, 200);
					stage2.getIcons().add(new Image("ImagLogin/Mensajero.png"));
					scene2.getStylesheets().add(String.valueOf(this.getClass().getResource("application.css")));
					stage2.setTitle("ChatSpace");
					stage2.setScene(scene2);
					stage2.show();

					firstgui.getBtnRegresar().setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							firstgui.getTxtUser().clear();
							firstgui.getPswClave().clear();
							stage2.close();
							stage1.show();
						}
					});
				}

				else {
					stage1.close();

					LoginTwoController secondgui = new LoginTwoController(10);
					secondgui.getPanelIzq().setContent(secondgui.getVbox());

					Top topleft = new Top(firstgui.getTxtUser().getText());
					topleft.styles();
					Top topright = new Top();
					Bottom inferior = new Bottom();
					inferior.styles();
					secondgui.setInferior(inferior.getHbox());
					topleft.topLeft();
					secondgui.setTopleft(topleft.getTopleft());
					secondgui.setTopright(topright.getTopright());
					secondgui.anchor1();

					User usuario = usuarios.userName(firstgui.getTxtUser().getText());

					int incremento = 0;
					for (Chat activos : chats.getChat(usuario.getId())) {
						msjDiseno leftdesign = new msjDiseno();
						leftdesign.contenido(activos.getUsuario().getImagen(), activos.getUsuario().getNombre(),
								activos.getMensaje().getMensaje(), activos.getMensaje().getFecha());

						leftdesign.leftDesign();
						leftdesign.getLeftdesign().setId(String.valueOf(activos.getUsuario().getId()));

						secondgui.setLeftdesign(leftdesign.getLeftdesign());
						secondgui.getVbox().getChildren().add(secondgui.getLeftdesign());

						incremento = incremento + 1;

						leftdesign.getLeftdesign().addEventFilter(MouseEvent.MOUSE_CLICKED,
								new EventHandler<MouseEvent>() {

									@Override
									public void handle(MouseEvent event) {
										LoginTwoController fp = new LoginTwoController();
										User contacto = usuarios
												.userId(Integer.valueOf(leftdesign.getLeftdesign().getId()));

										topright.getTopright().getChildren().clear();
										topright.topRight(contacto.getId());

										secondgui.visible();
										secondgui.getPanelDer().setVvalue(1.0);

										for (Mensaje msj : mensajes.conversaciones(usuario.getId(), contacto.getId())) {
											Right rightdesign = new Right();
											rightdesign.styles();

											if (msj.getUsuario1().getId() == usuario.getId()) {
												rightdesign.messageUser(msj.getUsuario1().getImagen(), msj.getMensaje(),
														msj.getFecha());
												fp.getFlowpane().getChildren().add(rightdesign.getRightdesign());
											}

								else {
												rightdesign.messageContact(msj.getUsuario1().getImagen(),
														msj.getMensaje(), msj.getFecha());
												fp.getFlowpane().getChildren().add(rightdesign.getRightdesign());
											}

											inferior.getBoton().setOnAction(new EventHandler<ActionEvent>() {

												@Override
												public void handle(ActionEvent event) {
													if (!inferior.getTexto().getText().equals("")) {

														DateTimeFormatter datetimeformat = DateTimeFormatter
																.ofPattern("dd MMM, YYYY  HH:mm");
														LocalDateTime fecha = LocalDateTime.now();

														Right rightdesign = new Right();
														rightdesign.styles();

														rightdesign.messageUser(usuario.getImagen(),
																inferior.getTexto().getText(), fecha);

														fp.getFlowpane().getChildren()
																.add(rightdesign.getRightdesign());

														leftdesign.getMensaje().setText(inferior.getTexto().getText());
														leftdesign.getDatetime().setText(datetimeformat.format(fecha));

														secondgui.ajusteDesplDer(fp.getFlowpane());

														Mensaje newMessage = new Mensaje(
																activos.getMensaje().getId() + 1, usuario, contacto,
																fecha, inferior.getTexto().getText());
														mensajes.addMensajes(newMessage);
														inferior.getTexto().clear();

													}
												}
											});

											secondgui.getPanelDer().setContent(fp.getFlowpane());
										}
									}
								});
					}

					Stage stage3 = new Stage();
					Scene scene3 = new Scene(secondgui.getAnchorPane(), 1000, 600);
					stage3.getIcons().add(new Image("ImagLogin/Mensajero.png"));
					scene3.getStylesheets().add(String.valueOf(this.getClass().getResource("application.css")));
					stage3.setTitle("Chat");
					stage3.setScene(scene3);
					stage3.show();

					topleft.getLogout().setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							firstgui.getTxtUser().clear();
							firstgui.getPswClave().clear();

							stage3.close();
							stage1.show();
						}
					});
				}
			}
		});

	}

	public static void main(String[] args) {
		launch(args);
	}

}
