package Tickets;

import java.io.IOException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		OutPut o = new OutPut();
		InputData in = new InputData();
		Processing p = new Processing();
		WriteFile w = new WriteFile();
		FileRead fr = new FileRead();
		
//		Variables.report = fr.getData();
//		p.getReport(Variables.report);
		
		w.fileOpen();
		w.headWrite();
		o.printEntryMenu();
		while(true) {

				o.ticketChoiceMenu();
				Variables.ticketChoice = Integer.parseInt(in.choice());
				
				if(Variables.ticketChoice < 0 && Variables.ticketChoice >= 3) {
					o.typeAgain(); o.ticketChoiceMenu();
					Variables.ticketChoice = Integer.parseInt(in.choice());
					
				} else if(Variables.ticketChoice == 0) {
					break;
				} else if(Variables.ticketChoice == 1) {
					p.getTicket();
					if(Variables.ssnum.equals("0") || Variables.discount == 0 || Variables.ticketAmount == 0) break;
				} else if(Variables.ticketChoice == 2) {
					p.getTicket();
					if(Variables.ssnum.equals("0") || Variables.discount == 0 || Variables.ticketAmount == 0) break;
				}
				w.dataWrite(Variables.typeskor, Variables.ticketAmount);				
		}
		w.fileClose();
	}
}
