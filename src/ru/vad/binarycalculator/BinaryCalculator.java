package ru.vad.binarycalculator;

public class BinaryCalculator {

	// Method translation from the binary system in the decimal
	public String TranslationONS(int a) {
		String count = "";
		StringBuffer sb = new StringBuffer();
		
		while (a > 0) {
			if (a % 2 == 0) {
				count = count + "0";
			} else {
				count = count + "1";
			}
			a = a / 2;
		}
		sb.append(count);
		if(count.length()==1){
			sb.insert(0,"000");			
		}else if(count.length()==2){
			sb.insert(0,"00");	
		}else if(count.length()==3){
			sb.insert(0,"0");	
		}
		
		return sb.toString();

	}

	public String accountAmount(int a, int b) {
		String str = null;
		TranslationONS(a);
		TranslationONS(b);
		for (int i = 0; i < TranslationONS(a).length(); i++) {
			if (TranslationONS(a).equals("1") && TranslationONS(b).equals("1")) {
				str = str + "10";
			} else if (TranslationONS(a).equals("0")&& TranslationONS(b).equals("1")||TranslationONS(a).equals("1")&& TranslationONS(b).equals("0")) {
				str = str + "1";
				
			} else if (TranslationONS(a).equals("0")&& TranslationONS(b).equals("0")) {
				str = str + "0";
			}
		}
		return str;
	}
}
