package ru.vad.binarycalculator;

public class ConvertLettersToNumbers {
	String[] lettersUpperRegisters = {"A","B","C","D","E","F"};
	String[] lettersLowerRegisters = {"a","b","c","d","e","f"};
	
	String[] ConvertedNumbers = {"1010","1011","1100","1101","1110","1111"};
	
	public String convert(String let){
		for(int i = 0;i<6;i++)
		if(let.equals(lettersUpperRegisters[i])||let.equals(lettersLowerRegisters[i])){
			return ConvertedNumbers[i];							
		}
		return null;
	}
	
}
