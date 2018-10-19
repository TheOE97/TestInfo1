/*
 * @author Oliver Engels
 * @version 0.1
 * 
 */


package TestPackage;

import javax.swing.*;

public class Zahlen {

	public static void main (String[] args){
		
		
		double zahl1, zahl2, zahl3, durchschnitt, abweichung;
		
		zahl1 = Math.random()*10;
		zahl2 = Math.random()*10;
		zahl3 = Math.random()*10;
		
		durchschnitt = (zahl1+zahl2+zahl3)/3;
		abweichung = 5 - durchschnitt;
		
		System.out.println(durchschnitt + "\t" + abweichung);
		System.out.println('\u2B86');
		
	}
	
	
}
