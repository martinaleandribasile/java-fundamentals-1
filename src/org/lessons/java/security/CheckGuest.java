package org.lessons.java.security;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] guest= { 
				"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax","Francessco Totti","Ilary Blasi","Bebe Vio", "Luis", "Paradais Zarei", "Martina Maccherone","Rachel Zeili"
		};
		
		Scanner s= new Scanner(System.in);
		System.out.println("Inserisci il tuo Nome e Cognome");
		String nominativo = s.nextLine();
		
		boolean inLista = false;
		for(int i=0; i < guest.length ; i++) {
			if(nominativo.toLowerCase().trim().equals(guest[i].toLowerCase().trim())) {
				inLista=true;
			}
		}
		if(inLista) 
			System.out.println("Salve, lei " + nominativo + " e' in lista, si puo' accomodare");
		else System.out.println("Mi dispiace " + nominativo + " lei non e' in lista, NON PUO' ENTRARE" );
		
		s.close();
	}

}
