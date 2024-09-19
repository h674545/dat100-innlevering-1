package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {
		
		int tall = parseInt(showInputDialog("For å få verdien av n!, tast inn et positivt heltall"));
		
		int n = 1;
		
		for(int i = 1; i <= tall; i++) {
			n *= i;
		}
		System.out.println("Verdien av " + tall + "! er " + n);
	}

}
