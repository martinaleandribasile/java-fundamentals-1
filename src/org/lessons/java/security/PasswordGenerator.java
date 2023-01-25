package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		String nome;
		String cognome;
		String colore;
		int anno;
		int mese;
		int giorno;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome");
		nome=s.nextLine();
		String nomeCapitalize= nome.substring(0,1).toUpperCase() + nome.substring(1);
		System.out.print("Inserisci il tuo cognome");
		cognome=s.nextLine();
		String cognomeCapitalize= cognome.substring(0,1).toUpperCase() + cognome.substring(1);
		System.out.print("Inserisci il tuo colore preferito");
		colore=s.nextLine();
		System.out.print("Inserisci il tuo anno di nascita");
		anno=s.nextInt();
		System.out.print("Inserisci il tuo mese di nascita (valore numerico)");
		mese=s.nextInt();
		System.out.print("Inserisci il tuo giorno di nascita");
		giorno=s.nextInt();
		
		int data= anno + mese + giorno;
		String password = nomeCapitalize + "-" + cognomeCapitalize + "-" + colore + "-" + data;
		System.out.println("La tua password e' " + password );
	}

}
