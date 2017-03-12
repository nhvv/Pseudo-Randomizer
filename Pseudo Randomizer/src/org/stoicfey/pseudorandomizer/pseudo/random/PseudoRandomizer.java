package org.stoicfey.pseudorandomizer.pseudo.random;

import java.util.Scanner;

import org.stoicfey.pseudorandomizer.pseudo.random.divisioner.Divisioner;
import org.stoicfey.pseudorandomizer.pseudo.random.milliseconds.getter.MillisecondsGetter;
import org.stoicfey.pseudorandomizer.pseudo.random.string.numeric.value.splitter.StringNumericValueProductCounter;
import org.stoicfey.pseudorandomizer.pseudo.random.values.comparator.ValueComparator;

public class PseudoRandomizer {

	private String currentTimeInMillisecondsInString; // zmienic nazwe 
	private int multipliedPartsOfMillis;
	private float evenNumberProduct;
	private float unevenNumberProduct;
	private float pseudoRandomNumber;
	private MillisecondsGetter millisecondsGetter;
	private StringNumericValueProductCounter stringNumericValueProductCounter;
	private Divisioner divisioner;
	private ValueComparator valueFinder;
	
	public PseudoRandomizer(MillisecondsGetter millisecondsGetter, StringNumericValueProductCounter stringNumericValueProductCounter, Divisioner divisioner, ValueComparator valueFinder) {
		this.millisecondsGetter = millisecondsGetter;
		this.stringNumericValueProductCounter = stringNumericValueProductCounter;
		this.divisioner = divisioner;
		this.valueFinder = valueFinder;
	}

	public void getRandomNumber(int minRange, int maxRange) {

		setCurrentTimeInMillisecondsInString(millisecondsGetter.getMillisInString());
		setMultipliedPartsOfMillis(1);
		setEvenNumberProduct(stringNumericValueProductCounter.getEvenNumbersProduct(getCurrentTimeInMillisecondsInString()));
		setUnevenNumberProduct(stringNumericValueProductCounter.getUnevenNumbersProduct(getCurrentTimeInMillisecondsInString()));
		setPseudoRandomNumber(1);

		

		setPseudoRandomNumber(divisioner.divideLowerByHigher(valueFinder.getHigherValue(getEvenNumberProduct(), getUnevenNumberProduct()), valueFinder.getLowerValue(getEvenNumberProduct(), getUnevenNumberProduct())));
		System.out.println(Math.round((getPseudoRandomNumber() * (maxRange-minRange+1) + minRange)));

	}

	public String getCurrentTimeInMillisecondsInString() {
		return currentTimeInMillisecondsInString;
	}

	public void setCurrentTimeInMillisecondsInString(String currentTimeInMilliseconds) {
		this.currentTimeInMillisecondsInString = currentTimeInMilliseconds;
	}

	public int getMultipliedPartsOfMillis() {
		return multipliedPartsOfMillis;
	}

	public void setMultipliedPartsOfMillis(int multipliedPartsOfMillis) {
		this.multipliedPartsOfMillis = multipliedPartsOfMillis;
	}

	public float getEvenNumberProduct() {
		return evenNumberProduct;
	}

	public void setEvenNumberProduct(float even) {
		this.evenNumberProduct = even;
	}

	public float getUnevenNumberProduct() {
		return unevenNumberProduct;
	}

	public void setUnevenNumberProduct(float uneven) {
		this.unevenNumberProduct = uneven;
	}

	public float getPseudoRandomNumber() {
		return pseudoRandomNumber;
	}

	public void setPseudoRandomNumber(float pseudoRandomNumber) {
		this.pseudoRandomNumber = pseudoRandomNumber;
	}


}
