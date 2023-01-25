package org.lessons.java.security;
import java.util.Scanner;
public class SondaggioOSScanner {

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
		
		float percentualeWindows= (float) ((windows*100)/studenti);
		System.out.println(percentualeWindows + "% di studenti che utilizzano Windows");
		float percentualeMac= (float) ((mac*100)/studenti);
		System.out.println(percentualeMac + "% di studenti che utilizzano Windows");
		float percentualeLinux= (float) ((linux*100)/studenti);
		System.out.println(percentualeLinux + "% di studenti che utilizzano Windows");
		
		if(windows + mac + linux != studenti) {
			int studentiOSIndefinito = studenti - (windows + mac + linux);
			float percentualeOSIndefinito= (float) ((studentiOSIndefinito*100)/studenti);
			System.out.println(percentualeOSIndefinito + "% non hanno dichiarato il loro OS");
		}
	}

}
