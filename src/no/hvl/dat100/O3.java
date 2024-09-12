package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {
		
		int tall = parseInt(showInputDialog("For å få verdien av n!, tast inn et positivt heltall"));
		
		int n = tall; 
		
		if( n > 0) {
			System.out.println("Verdien til n! med tallet " + n + " er " + (n-1)*n); 
		}
	}

}
