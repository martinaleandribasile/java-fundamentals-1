package org.lessons.java.security;

public class SondaggioOS {

	public static void main(String[] args) {
		int studenti=25;
		int windows=16;
		int linux= 3;
		int mac= 6;
		
		float percentualeWindows= (float) ((windows*100)/studenti);
		System.out.println(percentualeWindows + "% di studenti che utilizzano Windows");

		float percentualeMac= (float) ((mac*100)/studenti);
		System.out.println(percentualeMac + "% di studenti che utilizzano Mac");
		
		float percentualeLinux= (float) ((linux*100)/studenti);
		System.out.println(percentualeLinux + "% di studenti che utilizzano Linux");
	}

}
