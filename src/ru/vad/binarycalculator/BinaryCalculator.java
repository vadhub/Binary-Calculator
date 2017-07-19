package ru.vad.binarycalculator;

public class BinaryCalculator {

	// Method translation from the binary system in the decimal
	public String TranslationONS(int a) {
		String count = "";
		StringBuffer sub = new StringBuffer();
		
		while (a != 0) {
			if(a % 2 != 0){
				count = count + "1";								
			}else {
				count = count + "0";								
			}			
			a = a / 2;
		}
		sub.append(count).reverse();
		if(count.length()==1){
			sub.insert(0,"000");			
		}else if(count.length()==2){
			sub.insert(0,"00");	
		}else if(count.length()==3){
			sub.insert(0,"0");	
		}
		
		return sub.toString();

	}

	public String accountAmount(int a, int b) {
		String str="";
		
		String af = TranslationONS(a);
		String bf = TranslationONS(b);
		
		for (int i =0;i<af.length();i++){
			if(af.startsWith("1")){
				str +="1";
			}else {
				str +="0";				
			}
		}	
				
		return str;
	}
}
