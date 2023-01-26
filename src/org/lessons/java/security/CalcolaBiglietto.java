package org.lessons.java.security;
import java.util.Scanner;
public class CalcolaBiglietto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int km;
		int age;
		
		System.out.println("Quanti chilometri vuoi percorrere?");
		km=s.nextInt();
		
		System.out.println("Inserisci la tua eta'?");
		age= s.nextInt();
		
		double prezzoBiglietto=prezzoIntero(km,age);
		
		System.out.println("il tuo biglietto costa "+ prezzoBiglietto + " euro");
		s.close();
	}
	
	static double prezzoIntero(int km, int age) {
		double prezzo;
		double sconto = 0;
		double costo= 0.21;
		prezzo=(double)km * costo ;
		if(age<18) {
			System.out.println("hai uno sconto del 20% sul prezzo del totale del biglietto che e' di " + prezzo + "euro");
			sconto = prezzo - (prezzo*20/100);
		}else if(age>=65) {
			System.out.println("hai uno sconto del 40% sul prezzo del totale del biglietto che e' di "+ prezzo + "euro");
			sconto = prezzo - (prezzo*40/100);
		}else {
			sconto=prezzo;
		}
		return sconto;
	}
	
}
