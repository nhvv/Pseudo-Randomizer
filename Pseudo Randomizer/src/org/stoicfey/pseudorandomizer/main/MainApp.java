
package org.stoicfey.pseudorandomizer.main;


import java.util.Scanner;

import org.stoicfey.pseudorandomizer.pseudo.random.PseudoRandomizer;
import org.stoicfey.pseudorandomizer.pseudo.random.divisioner.Divisioner;
import org.stoicfey.pseudorandomizer.pseudo.random.milliseconds.getter.MillisecondsGetter;
import org.stoicfey.pseudorandomizer.pseudo.random.range.asker.RangeAsker;
import org.stoicfey.pseudorandomizer.pseudo.random.string.numeric.value.splitter.StringNumericValueProductCounter;
import org.stoicfey.pseudorandomizer.pseudo.random.values.comparator.ValueComparator;

public class MainApp {

	private static String beginRange;
	private static String endRange;
	private static int minRange;
	private static int maxRange;
	private static Scanner scanner;
	private static PseudoRandomizer pseudoRandomizer;
	private static Divisioner divisioner;
	private static ValueComparator valueComparator;
	private static StringNumericValueProductCounter stringNumericValueProductCounter;
	private static MillisecondsGetter millisecondsGetter;
	private static RangeAsker rangeAsker;

	public static void main(String[] args) {
			setMillisecondsGetter(new MillisecondsGetter());
			setStringNumericValueProductCounter(new StringNumericValueProductCounter());
			setValueComparator(new ValueComparator());
			setDivisioner(new Divisioner());
			setPseudoRandomizer(new PseudoRandomizer(getMillisecondsGetter(), getStringNumericValueProductCounter(), getDivisioner(), getValueComparator()));
			setScanner(new Scanner(System.in));
			setRangeAsker(new RangeAsker(getScanner()));
			
			getPseudoRandomizer().getRandomNumber(getRangeAsker().getMinRange(), getRangeAsker().getMaxRange()); // dorobic weryfikacje podanych wartosci
			getScanner().close();
			
			
	}

	public static int getMinRange() {
		return minRange;
	}

	public static void setMinRange(int minRange) {
		MainApp.minRange = minRange;
	}

	public static int getMaxRange() {
		return maxRange;
	}

	public static void setMaxRange(int maxRange) {
		MainApp.maxRange = maxRange;
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		MainApp.scanner = scanner;
	}

	public static PseudoRandomizer getPseudoRandomizer() {
		return pseudoRandomizer;
	}

	public static void setPseudoRandomizer(PseudoRandomizer pseudoRandomizer) {
		MainApp.pseudoRandomizer = pseudoRandomizer;
	}

	public static Divisioner getDivisioner() {
		return divisioner;
	}

	public static void setDivisioner(Divisioner divisioner) {
		MainApp.divisioner = divisioner;
	}

	public static String getBeginRange() {
		return beginRange;
	}

	public static void setBeginRange(String beginRange) {
		MainApp.beginRange = beginRange;
	}

	public static String getEndRange() {
		return endRange;
	}

	public static void setEndRange(String endRange) {
		MainApp.endRange = endRange;
	}

	public static ValueComparator getValueComparator() {
		return valueComparator;
	}

	public static void setValueComparator(ValueComparator valueFinder) {
		MainApp.valueComparator = valueFinder;
	}

	public static StringNumericValueProductCounter getStringNumericValueProductCounter() {
		return stringNumericValueProductCounter;
	}

	public static void setStringNumericValueProductCounter(StringNumericValueProductCounter stringNumericValueProductCounter) {
		MainApp.stringNumericValueProductCounter = stringNumericValueProductCounter;
	}

	public static MillisecondsGetter getMillisecondsGetter() {
		return millisecondsGetter;
	}

	public static void setMillisecondsGetter(MillisecondsGetter millisecondsGetter) {
		MainApp.millisecondsGetter = millisecondsGetter;
	}

	public static RangeAsker getRangeAsker() {
		return rangeAsker;
	}

	public static void setRangeAsker(RangeAsker rangeAsker) {
		MainApp.rangeAsker = rangeAsker;
	}

}