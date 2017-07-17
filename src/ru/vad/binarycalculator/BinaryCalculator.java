package ru.vad.binarycalculator;

import java.util.ArrayList;

public class BinaryCalculator {

	// Method translation from the binary system in the decimal
	public void TranslationONS(int a) {
		ArrayList<Integer> count = new ArrayList<>();

		while (a > 0) {
			if (a % 2 == 0) {
				count.add(0);
			} else {
				count.add(1);
			}
			a = a / 2;
		}
		for (int i = 0; i < count.size(); i++) {
			System.out.println(count.get(i));
		}
	}

	public void accountAmount(int a, int b) {

	}
}
