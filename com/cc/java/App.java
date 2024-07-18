package com.cc.java;

public class App {

	static String preStr = "Das Ergebnis ist: ";
	
	public static void main(String[] args) {
		
		RechnerInst rechnerInst = new RechnerInst();
		
		output("Ergebnis: " + rechnerInst.summe(1, 1));
		output("Ergebnis: " + rechnerInst.differenz(5, 1));
		output("Ergebnis: " + rechnerInst.produkt(2, 3));
		output("Ergebnis: " + rechnerInst.quotient(2, 4));
		
		output("-------------------------");

		output(preStr + RechnerStat.summe(1, 1));
		output(preStr + RechnerStat.differenz(5, 1));
		output(preStr + RechnerStat.produkt(2, 3));
		output(preStr + RechnerStat.quotient(2, 4));
		
		output(preStr + Math.PI);
		
	}

	
	static void output(String outputStr){
		System.out.println(outputStr);
	}
	
	
} // EoC
