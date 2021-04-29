package Tickets;

import java.util.Scanner;

public class InputData {
	Scanner scan = null;
	
	InputData(){
		scan = new Scanner(System.in);
	}
	
	public String choice() {
		return scan.nextLine();
	}
}
