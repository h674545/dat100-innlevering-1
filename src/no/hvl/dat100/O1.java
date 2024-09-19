package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class O1 {
	
	public static void main(String[] args) {
		
		int bruttoInntekt = parseInt(showInputDialog(" Tast inn inntekt før skatt "));
		
		int ingenTrinnskatt = 208050;
		int trinnSkatt1 = 292850;
		int trinnSkatt2 = 670000;
		int trinnSkatt3 = 937000;
		int trinnSkatt4 = 135000;
		int trinnSkatt5 = 1350001; 
		
		if(bruttoInntekt <= ingenTrinnskatt) {
			System.out.println("Ingen trinnskatt");
		} else if(bruttoInntekt <= trinnSkatt1) {
		System.out.println("Din trinnskatt er: " + (bruttoInntekt * 1.7) /100);
		} else if(bruttoInntekt <= trinnSkatt2) {
			System.out.println("Din trinnskatt er: " + (bruttoInntekt * 4.0) /100);
		} else if(bruttoInntekt <= trinnSkatt3) {	
			System.out.println("Din trinnskatt er: " + (bruttoInntekt * 13.6) /100);
		} else if(bruttoInntekt <= trinnSkatt4) {
			System.out.println("Din trinnskatt er: " + (bruttoInntekt * 16.6) /100);
		} else if(bruttoInntekt >= trinnSkatt5) {
			System.out.println("Din trinnskatt er: " + (bruttoInntekt * 17.6) /100);
		}
		
	}
}