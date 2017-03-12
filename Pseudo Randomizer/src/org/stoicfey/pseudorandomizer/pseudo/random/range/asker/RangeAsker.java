package org.stoicfey.pseudorandomizer.pseudo.random.range.asker;

import java.util.Scanner;

public class RangeAsker { // change naming
	
	private Scanner scanner;
	
	public RangeAsker(Scanner scanner){
		this.setScanner(scanner);
	}
	
	public int getMinRange(){
		System.out.println("Min range: ");
		return(scanner.nextInt());

	}
	
	public int getMaxRange(){
		System.out.println("Max range: ");
		return(scanner.nextInt());
			
	}
	


	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
}	
