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

	public int TranslationBND(String a) {
		StringBuffer sub = new StringBuffer();
		sub.append(a).reverse();
		int count = 1;
		int out = 0;
		
		for (int i = -1; i < sub.length(); i++) {
			if (a.startsWith("1",i)) {
				count = count^i;
				out = out +count;				
			}
		}
		return out;
	}

	// method summ two numbers
	public String accountAmount(int a, int b) {
		String str = "";
		StringBuffer sBuf = new StringBuffer(str);

		String af = TranslationONS(a);
		String bf = TranslationONS(b);

		int omp = af.length() + (bf.length() - af.length());

		for (int i = 0; i < omp; i++) {

			if (af.startsWith("0", i) && bf.startsWith("0", i)) {
				str = str + "0";
			} else if (af.startsWith("1", i) && bf.startsWith("0", i)
					|| af.startsWith("0", i) && bf.startsWith("1", i)) {
				str = str + "1";
			} else if (af.startsWith("1", i) && bf.startsWith("1", i)) {
				sBuf.insert(i - 1, '1');
			}
		}
		return sBuf.toString();
	}

	// Multiplication of numbers
	public String accountMultip(int a, int b) {
		String str = "";

		String af = TranslationONS(a);
		String bf = TranslationONS(b);

		int omp = af.length() + (bf.length() - af.length());

		for (int i = 0; i < omp; i++) {

			if (af.startsWith("0", i) && bf.startsWith("0", i)) {
				str = str + "0";
			} else if (af.startsWith("1", i) && bf.startsWith("0", i)
					|| af.startsWith("0", i) && bf.startsWith("1", i)) {
				str = str + "0";
			} else if (af.startsWith("1", i) && bf.startsWith("1", i)) {
				str = str + "1";
			}
		}
		return af;
	}
}
