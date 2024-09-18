package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Mensaje;
import com.message.dominio.User;

public class MessageListDao 
{
    private List<Mensaje> mensajes = new ArrayList<Mensaje>();
	private UserListDao usuario = new UserListDao();
	
	public MessageListDao() 
	{
		User Brando = usuario.userId(1);
		User Melissa = usuario.userId(2);
		User Evelyn = usuario.userId(3);
		User Domenica = usuario.userId(4);
		User Cristhian = usuario.userId(5);
		User Chirinos = usuario.userId(6);
		User Garañon = usuario.userId(7);
		User Potter = usuario.userId(8);
		
		//!CONVERSACIONES DE BRANDOLOKURAS
		mensajes.add(new Mensaje(1, Melissa, Brando, LocalDateTime.of(2022, 11, 16, 12, 30), "Hoy pega Baruu"));
		mensajes.add(new Mensaje(2, Brando, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Bastaaa, Donde que es?"));
		
		mensajes.add(new Mensaje(3, Brando, Evelyn, LocalDateTime.of(2022, 11, 16, 12, 30), "Oye cierto que el viernes pega complejo"));
		mensajes.add(new Mensaje(1, Evelyn, Brando, LocalDateTime.of(2022, 11, 16, 12, 30), "Sii invita a los muchachos Pilas"));
		
		mensajes.add(new Mensaje(4, Brando, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30),  "Hola pa donde que es"));
		mensajes.add(new Mensaje(1, Domenica, Brando, LocalDateTime.of(2022, 11, 16, 12, 30), "a cualquier lugar menos a la casa"));
		
		mensajes.add(new Mensaje(1, Cristhian, Brando, LocalDateTime.of(2022, 11, 16, 12, 30), "Trae una de vodka"));
		mensajes.add(new Mensaje(5, Brando, Cristhian, LocalDateTime.of(2022, 11, 16, 12, 30), "Pilas ya voy por ahí"));
		
		
		
		//!CONVERSACIONES DE MELISSA
		mensajes.add(new Mensaje(2, Melissa, Evelyn, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola amiguis como te ha ido"));
		mensajes.add(new Mensaje(3, Evelyn, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Holiiiis bien horita me estoy haciendo las uñas"));
		
		mensajes.add(new Mensaje(4, Melissa, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola, vamos a comer empandas mañana"));
		mensajes.add(new Mensaje(2, Domenica, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "claro, de una tengo hambre despues de clases"));
		
		mensajes.add(new Mensaje(2, Cristhian, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Cuál es la misión? "));
		mensajes.add(new Mensaje(5, Melissa, Cristhian, LocalDateTime.of(2022, 11, 16, 12, 30), "Confirma, vamos a baru"));
		
		
		
		//!CONVERSACIONES DE EVELYN
		mensajes.add(new Mensaje(4, Evelyn, Domenica, LocalDateTime.of(2022, 11, 15, 13, 30), "Domenica te tengo un chisme jaja"));
		mensajes.add(new Mensaje(3, Domenica, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "Aver cuenta cuenta xd"));
		
		mensajes.add(new Mensaje(3, Brando, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 40), "Hola por donde vienes"));
		mensajes.add(new Mensaje(1, Evelyn, Brando, LocalDateTime.of(2022, 11, 15, 13, 30), "Se daño el bus, llegare tarde"));
		
		mensajes.add(new Mensaje(2, Evelyn, Melissa, LocalDateTime.of(2022, 11, 15, 13, 30), "Como vas con programacion? "));
		mensajes.add(new Mensaje(3, Melissa, Evelyn, LocalDateTime.of(2022, 11, 15, 13, 30), "tengo un poco de codigo en mi error"));
		
		//!CONVERSACIONES DE DOMENICA
		
		mensajes.add(new Mensaje(4, Brando, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "Hola por donde vienes"));
		mensajes.add(new Mensaje(1, Domenica, Brando, LocalDateTime.of(2022, 11, 16, 12, 30), "Se daño el bus, llegare tarde"));
		
		mensajes.add(new Mensaje(2, Domenica, Melissa, LocalDateTime.of(2022, 11, 16, 12, 30), "Como vas con programacion? "));
		mensajes.add(new Mensaje(4, Melissa, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "tengo un poco de codigo en mi error"));

		//!CONVERSACIONES DE CRISTHIAN
		mensajes.add(new Mensaje(4, Cristhian, Domenica, LocalDateTime.of(2022, 11, 16, 12, 30), "Oye men, ya terminaste tu parte del proyecto o no ?"));
		mensajes.add(new Mensaje(1, Domenica, Cristhian, LocalDateTime.of(2022, 11, 16, 12, 30), "No, aun no, estoy haciendo estadistica antes"));
		
		//!CONVERSACIONES DE CHIRINOS
		mensajes.add(new Mensaje(1, Chirinos, Brando , LocalDateTime.of(2023, 02, 16, 12, 30), "Hola Brando, vamos a tomar :)"));
		mensajes.add(new Mensaje(6, Brando, Chirinos, LocalDateTime.of(2023, 02, 16, 12, 32), "No Kevin, eso hace daño y me quiero ir a mi casa dormir"));
		mensajes.add(new Mensaje(1, Chirinos, Brando, LocalDateTime.of(2023, 02, 16, 12, 33), "Vamos, no seas egoista"));
		
		//!CONVERSACIÓN DE TAPIA
		mensajes.add(new Mensaje(1, Garañon, Brando, LocalDateTime.of(2023, 02, 16, 12, 30), "Estoy vendiendo mangos"));
		mensajes.add(new Mensaje(7, Brando, Garañon , LocalDateTime.of(2023, 02, 16, 12, 30), "De donde son y cuanto cuesta?"));
		mensajes.add(new Mensaje(1, Garañon, Brando, LocalDateTime.of(2023, 02, 16, 12, 30), "Son de la facultad y la funda a 1$"));
	
		//!CONVERSACIÓN DE POTTER
		mensajes.add(new Mensaje(1, Potter,Brando, LocalDateTime.of(2023, 02, 16, 12, 30), "Gracias por irme a buscar cuando me perdí en la playa"));
		mensajes.add(new Mensaje(8, Brando, Potter, LocalDateTime.of(2023, 02, 16, 12, 30), "Eso hacen los amigos pero siemre me voy a reir al ver tu cara AJAJAJAJA"));
		mensajes.add(new Mensaje(1, Potter,Brando, LocalDateTime.of(2023, 02, 16, 12, 30), "Estaba a punto de llorar, te soy sincero"));
	
	}
	
	public List<Mensaje> getMensajes(){
		return mensajes;
	}
	
	public List<Mensaje> conversaciones(int usuario1, int usuario2) {
		List<Mensaje> resultado = new ArrayList<Mensaje>();
		for(Mensaje msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Mensaje getUltimoMsj(int usuario1, int usuario2) {
		List<Mensaje> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Mensaje mensaje) {
		mensajes.add(mensaje);		
	}    
}
