package Tickets;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		OutPut o = new OutPut();
		InputData in = new InputData();
		Processing p = new Processing();
		o.printEntryMenu();
		while(true) {
			o.ticketChoiceMenu();
			Variables.ticketChoice = Integer.parseInt(in.ticketChoice());
			
			if(Variables.ticketChoice == 0) {
				break;
			} else {
				o.ssnumInputMenu();
				Variables.ssnum = in.ssnumInput();
				Variables.age = p.getAge(Variables.ssnum);
				o.discountDetail();
				Variables.discount = Integer.parseInt(in.discountDetail());
				
			}
		}
	}
}
