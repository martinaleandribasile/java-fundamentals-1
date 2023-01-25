package org.lessons.java.security;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SondaggioOSScanner {
	private static final DecimalFormat round = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		int studenti;
		int windows;
		int linux;
		int mac;
		Scanner s = new Scanner(System.in);
		System.out.print("Quanti studenti sono presenti in classe?");
		studenti= s.nextInt();
		System.out.print("Quanti studenti usano Windows?");
		windows= s.nextInt();
		System.out.print("Quanti studenti usano Mac?");
		mac= s.nextInt();
		System.out.print("Quanti studenti usano Linux?");
		linux= s.nextInt();
		
		double percentualeWindows=  ((double)(windows*100)/studenti);
		System.out.println(round.format(percentualeWindows) + "% di studenti che utilizzano Windows");
		double percentualeMac=  ((double)(mac*100)/studenti);
		System.out.println(round.format(percentualeMac) + "% di studenti che utilizzano Windows");
		double percentualeLinux=  ((double)(linux*100)/studenti);
		System.out.println( round.format(percentualeLinux) + "% di studenti che utilizzano Windows");
		
		
		int inseriti= windows + mac + linux;
		if(inseriti < studenti) {
			int studentiOSIndefinito = studenti - (windows + mac + linux);
			double percentualeOSIndefinito= (double) ((studentiOSIndefinito*100)/studenti);
			System.out.println(percentualeOSIndefinito + "% non hanno dichiarato il loro OS, mancano " + studentiOSIndefinito + " dichiarazioni di OS" );
		}
		s.close();
	}

}
