package ru.vad.binarycalculator;

import java.util.ArrayList;

public class BinaryCalculator {
	
	
	//Method translation from the binary system in the decimal
	public int TranslationONS(int a) {
		

		// Subsidiary array
		int[] sub = new int[a];
		ArrayList<Integer> count = new ArrayList<>();
		
		for (int i = 0; i < sub.length; i++) {
			if (a % 2 == 0) {
				count.add(0);
			} else {
				count.add(1);
			}
		}		
		return a;
	}
	
	

	public void accountAmount(int a, int b) {

	}
}
