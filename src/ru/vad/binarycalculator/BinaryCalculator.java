package ru.vad.binarycalculator;

public class BinaryCalculator {

	// Method translation from the binary system in the decimal
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
	
	public String rotateWords(String word){
		String result = "";
		for(int i = word.length() - 1;i>=0;i--){
			result = result + word.substring(i, i+1);			
		}
		return result;
	}

	//// Method translation from the decimal system in the binary
	public double TranslationBND(String a) {		
		double out = 0;
		a = rotateWords(a); 
		for (int i = 0; i < a.length(); i++) {
	        out += Math.pow(2, i) * (a.charAt(i) == '1' ? 1 : 0);
	    }
		return out;
	}
	
	// method summ two numbers
	public String accountAmount(int a, int b) {		 
		a = a+b;
		String tr = TranslationONS(a);	
		return tr;
	}

	// Multiplication of numbers
	public String accountMultip(int a, int b) {
		a = a*b;
		String tr = TranslationONS(a);
		
		return tr;
	}
	
	
}
