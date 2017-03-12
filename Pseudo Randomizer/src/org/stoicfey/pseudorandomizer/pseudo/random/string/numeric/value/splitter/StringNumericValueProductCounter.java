package org.stoicfey.pseudorandomizer.pseudo.random.string.numeric.value.splitter;

public class StringNumericValueProductCounter {

	private static int uneven;
	private static int even;

	public int getEvenNumbersProduct(String string) {
		setEven(1);
		for (int i = string.length() - 1; i >= 0; i--) {
			if (Integer.parseInt(Character.toString(string.charAt(i))) % 2 == 0
					&& Integer.parseInt(Character.toString(string.charAt(i))) != 0) {
				setEven(getEven() * Integer.parseInt(Character.toString(string.charAt(i))));
			}
		}

		return getEven();
	}

	public int getUnevenNumbersProduct(String string) {
		setUneven(1);
		for (int i = string.length() - 1; i >= 0; i--) {
			if (Integer.parseInt(Character.toString(string.charAt(i))) % 2 != 0
					&& Integer.parseInt(Character.toString(string.charAt(i))) != 0) {
				setUneven(getUneven() * Integer.parseInt(Character.toString(string.charAt(i))));
			}
		}

		return getUneven();
	}

	
	
	public static int getUneven() {
		return uneven;
	}

	public static void setUneven(int uneven) {
		StringNumericValueProductCounter.uneven = uneven;
	}

	public static int getEven() {
		return even;
	}

	public static void setEven(int even) {
		StringNumericValueProductCounter.even = even;
	}



}
