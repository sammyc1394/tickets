package Tickets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Processing {
	
	
	public int getAge(String ssnum) throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		
		String birthday = ssnum.substring(0,6);
		String today = sdf.format(cal.getTime());
		
		System.out.printf("today [%s] B_day [%s]\n", today, birthday);
		
		Variables.b_year = Integer.parseInt(ssnum.substring(0,2));
		Variables.b_month = Integer.parseInt(ssnum.substring(2,4));
		Variables.b_day = Integer.parseInt(ssnum.substring(4,6));

		Variables.t_year = Integer.parseInt(today.substring(0, 2));
		Variables.t_month = Integer.parseInt(today.substring(2, 4));
		Variables.t_day = Integer.parseInt(today.substring(4, 6));
		
		int age = 0;
		
		if(Variables.b_year <= 99 && Variables.b_year > Variables.t_year) {
			age = (100 - Variables.b_year) + (Variables.t_year);
			
		} else if(Variables.b_year >= 0 && Variables.b_year <= Variables.t_year) {
			age = (Variables.t_year - Variables.b_year);
			
		}
		
		if(Variables.b_month > Variables.t_month) {
			age -= 1;
			
		}else  if (Variables.b_month == Variables.t_month) {
			
			if(Variables.b_day >= Variables.t_day) {
				age -= 1;
				
			}
		} 
		
		System.out.printf("\nb_year[%d] b_month[%d] b_day[%d]\nt_year[%d] t_month[%d] t_day[%d]\nage[%d]\n\n", Variables.b_year, Variables.b_month, Variables.b_day, Variables.t_year, Variables.t_month, Variables.t_day, Variables.age);
			
		return Variables.age;
	}
	
	public void getTicketPrice(int ticketChoice, int age, int discount) {
		int ticketPrice = 0;
		if(ticketChoice == 1) {
			if(age <= 2) {
				ticketPrice = 0;
			} else if(age >= 3 && age <= 12) {
				ticketPrice = 
			}
		}
	}
		
}
