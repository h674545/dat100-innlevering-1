package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class O2 {
	
	public static void main(String[] args) {
		
		int start = 0; 
		int a = 100; 
		int b = 89; 
		int c = 79; 
		int d = 59; 
		int e = 49;
		int f = 39;
		
		for(int i = 1; i<= 10; i++) {
		int poengsum = parseInt(showInputDialog("Tast inn din poengsum"));
		
		if(poengsum < start || poengsum > a) {
			System.out.println("Ugyldig poengsum");
		} else if(poengsum <= f) {
			System.out.println("Karakteren din er F");
		} else if(poengsum <= e) {
			System.out.println("Karakteren din er E");
		} else if(poengsum <= d) {
			System.out.println("Karakteren din er D");
		} else if(poengsum <= c) {
			System.out.println("Karakteren din er C");
		} else if(poengsum <= b) {	
			System.out.println("Karakteren din er B");
		} else {
			System.out.println("Karakteren din er A");
			}
		}

	}
}