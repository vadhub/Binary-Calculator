package ru.vad.binarycalculator;

import java.util.ArrayList;

public class BinaryCalculator {

	// Method translation from the binary system in the decimal
	public ArrayList<String> TranslationONS(int a) {
		ArrayList<String> count = new ArrayList<>();

		while (a > 0) {
			if (a % 2 == 0) {
				count.add("0");
			} else {
				count.add("1");
			}
			a = a / 2;
		}
		return count;

	}

	public void accountAmount(int a, int b) {
		String str = null;		
		TranslationONS(a);
		TranslationONS(b);
		for (int i = 0; i < TranslationONS(a).size(); i++) {
			if (TranslationONS(a).equals("1")&&TranslationONS(b).equals("1")) {
				str= str +"10";								
			}
		}		
	}
}
