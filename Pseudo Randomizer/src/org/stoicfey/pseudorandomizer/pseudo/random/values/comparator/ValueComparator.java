package org.stoicfey.pseudorandomizer.pseudo.random.values.comparator;

public class ValueComparator {
	public float getHigherValue(float value1, float value2){
		if(value1>value2){
			return value1;
		}
		else if(value1<value2){
			return value2;
		}
		System.out.println("Values are even. Returning 0...");
		return 0;
	}
	
	public float getLowerValue(float value1, float value2){
		if(value1<value2){
			return value1;
		}
		else if(value1>value2){
			return value2;
		}
		System.out.println("Values are even. Returning 0...");
		return 0;
	}
	
}
