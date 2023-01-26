package org.lessons.java.security;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] cibiPreferiti= {"fiorentina","filetto alla rossini","pasta","pizza","sushi","hamburgher","gelato"};
		System.out.println("La mia lista dei cibi preferiti e' lunga: " + cibiPreferiti.length);
		System.out.println("Il mio cibo preferito e': " + cibiPreferiti[0]);
		System.out.println("Il mio cibo meno preferito e': " + cibiPreferiti[cibiPreferiti.length -1]);
		
		if(cibiPreferiti.length%2 !=0) {
			int mediana= (cibiPreferiti.length)/2;
			String ciboMediano= cibiPreferiti[mediana];
			System.out.println("il cibo che si trova a meta' classifica e': " + ciboMediano);
		}else {
			int mediana1=(cibiPreferiti.length)/2;
			int mediana2=(cibiPreferiti.length)/2 -1;
			System.out.println("i cibi che si trovano a meta' classifica sono: " +cibiPreferiti[mediana1] +" "+ cibiPreferiti[mediana2]);
		}
	}
}
