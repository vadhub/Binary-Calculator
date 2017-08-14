package ru.vad.binarycalculator;

/*
 * class Class is responsible for translating numbers from the decimal 
 * number system to binary and the product of mathematical operations
 *  on these numbers
 */

public class BinaryCalculator {

	// Method translation from the decimal system in the binary
	public String TranslationONS(int a) {
		String count = "";
		StringBuffer sub = new StringBuffer();

		while (a != 0) {
			if (a % 2 != 0) {
				count = count + "1";
			} else {
				count = count + "0";
			}
			a = a / 2;
		}
		sub.append(count).reverse();
		if (count.length() == 1) {
			sub.insert(0, "000");
		} else if (count.length() == 2) {
			sub.insert(0, "00");
		} else if (count.length() == 3) {
			sub.insert(0, "0");
		}

		return sub.toString();

	}

	public String rotateWords(String word) {
		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			result = result + word.substring(i, i + 1);
		}
		return result;
	}

	// // Method translation from the binary system in the decimal
	public double TranslationBND(String a) {
		double out = 0;
		a = rotateWords(a);
		for (int i = 0; i < a.length(); i++) {
			out += Math.pow(2, i) * (a.charAt(i) == '1' ? 1 : 0);
		}
		return out;
	}

	// method summ two numbers
	public String SumNumber(int a, int b) {
		a = a + b;
		String tr = TranslationONS(a);
		return tr;
	}

	// Multiplication of numbers
	public String MultipNumber(int a, int b) {
		a = a * b;
		String tr = TranslationONS(a);

		return tr;
	}

	// Dividing of numbers
	public String DividingNumber(int a, int b) {
		a = a / b;
		String tr = TranslationONS(a);

		return tr;
	}

	// Difference of numbers
	public String DifferenceNumber(int a, int b) {
		int dif = 0;
		if (a > b) {
			dif = b - a;
		} else {
			dif = a - b;
		}

		String tr = TranslationONS(dif);

		return tr;
	}

}
