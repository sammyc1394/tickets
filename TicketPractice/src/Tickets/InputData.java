package Tickets;

import java.util.Scanner;

public class InputData {
	Scanner scan = null;
	
	InputData(){
		scan = new Scanner(System.in);
	}
	
	public String ticketChoice() {
		return scan.nextLine();
	}
	
	public String ssnumInput() {
		return scan.nextLine();
	}
	
	public String discountDetail() {
		return scan.nextLine();
	}
	
	public String getTicketAmount() {
		return scan.nextLine();
	}
}
