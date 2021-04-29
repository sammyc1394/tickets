package Tickets;

import java.io.*;
import java.text.*;
import java.util.*;

public class Processing {
	
	public OutPut o = new OutPut();
	public InputData in = new InputData();
	public FileRead fr = new FileRead();
	
	public int getAge(String ssnum) throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		
		String birthday = ssnum.substring(0,6);
		String today = sdf.format(cal.getTime());
		
		System.out.printf("today [%s] B_day [%s]\n", today, birthday);
		
		Variables.b_year = Integer.parseInt(ssnum.substring(0,2));
		Variables.b_month = Integer.parseInt(ssnum.substring(2,4));
		Variables.b_day = Integer.parseInt(ssnum.substring(4,6));
		Variables.sex = Integer.parseInt(ssnum.substring(6, 7));

		Variables.t_year = Integer.parseInt(today.substring(0, 2));
		Variables.t_month = Integer.parseInt(today.substring(2, 4));
		Variables.t_day = Integer.parseInt(today.substring(4, 6));
		
		int age = 0;
		
		if(Variables.sex == 1 || Variables.sex == 2) {
			age = (100 - Variables.b_year) + (Variables.t_year);
			
		} else if(Variables.sex == 3 || Variables.sex == 4) {
			age = (Variables.t_year - Variables.b_year);
			
		}
		
		if(Variables.b_month > Variables.t_month) {
			age -= 1;
			
		}else  if (Variables.b_month == Variables.t_month) {
			
			if(Variables.b_day >= Variables.t_day) {
				age -= 1;
				
			}
		} 
//		System.out.printf("\nb_year[%d] b_month[%d] b_day[%d]\nt_year[%d] t_month[%d] t_day[%d]\nage[%d] sex[%s]\n\n", 
//				Variables.b_year, Variables.b_month, Variables.b_day, Variables.t_year, Variables.t_month, Variables.t_day, 
//				age, Variables.sex);
			
		return age;
	}
	
	public String[] getTicketPrice(int ticketChoice, int age, int discount, int amount) {
		int ticketPriceOne = 0;
		double ticketPriceDiscounted = 0;
		int totalPrice = 0;
		String ticketType = "";
		String discountType = "";
		String ageType = "";

		String ticketTypeKor = "";
		String discountTypeKor = "";
		String ageTypeKor = "";
		
		if(ticketChoice == 1) {
			ticketType = "Day";
			ticketTypeKor = "주간권";
		} else if(ticketChoice == 2) {
			ticketType = "Night";
			ticketTypeKor = "야간권";
		}
		
		if(discount == 1) {
			discountType = "none";
			discountTypeKor = "없음";
		} else if(discount == 2) {
			discountType = "disabled";
			discountTypeKor = "장애인";
		} else if(discount == 3) {
			discountType = "patriots";
			discountTypeKor = "국가유공자";
		} else if(discount == 4) {
			discountType = "children";
			discountTypeKor = "다자녀";
		} else if(discount == 5) {
			discountType = "pregnant";
			discountTypeKor = "임산부";
		}
		
		if(age <= 2) {
			ageType = "infant"; // 꽁짜
			ageTypeKor = "유아";
		} else if(age >= 3 && age <= 12) {
			ageType = "baby"; // 유아
			ageTypeKor = "소인";
		} else if(age >= 13 && age <= 18) {
			ageType = "teen"; // 청소년
			ageTypeKor = "청소년";
		} else if(age >= 19 && age <= 64) {
			ageType = "adult"; // 성인
			ageTypeKor = "성인";
		} else if(age >= 65) {
			ageType = "elder"; // 노약자
			ageTypeKor = "경로";
		}
		
		for(int i = 0; i < Collections.ticketPrices.length; i++) {
			if(Collections.ticketPrices[i][0].contains(ageType) && Collections.ticketPrices[i][0].contains(ticketType)) {
				ticketPriceOne = Integer.parseInt(Collections.ticketPrices[i][1]); 
				System.out.printf("price per one ticket [%s]\n", ticketPriceOne);
			}
		}
		
		for(int i = 0; i <Collections.DiscountRate.length; i++) {
			if(Collections.DiscountRate[i][0].contains(discountType)) {
				ticketPriceDiscounted = ticketPriceOne * Double.parseDouble(Collections.DiscountRate[i][1]);
				System.out.printf("discounted price(one) [%s]\n", ticketPriceDiscounted);
			}
		}
		
		totalPrice = (int)((ticketPriceOne * (amount - 1)) + ticketPriceDiscounted);
		
		String totalPriceS = String.valueOf(totalPrice);

		String[] types = {ticketTypeKor, ageTypeKor, discountTypeKor, totalPriceS};
		return types;
	}
	
	public void getTicket() throws ParseException {
		
		o.ssnumInputMenu();
		Variables.ssnum = in.choice();

		if(Variables.ssnum.length() != 7) {
			o.typeAgain();o.ssnumInputMenu();
			Variables.ssnum = in.choice();
		}
		
		Variables.age = getAge(Variables.ssnum);
		
		o.ticketAmount();
		
		Variables.ticketAmount = Integer.parseInt(in.choice());
		
//		if (Variables.ticketAmount == 0) {
//			break;
		if(Variables.ticketAmount > 10) {
			o.typeAgain(); o.ticketAmount();
			Variables.ticketAmount = Integer.parseInt(in.choice());
		}
		
		o.discountDetail();
		Variables.discount = Integer.parseInt(in.choice());
//		if (Variables.discount == 0) break;
		Variables.typeskor = getTicketPrice(Variables.ticketChoice, Variables.age, Variables.discount, Variables.ticketAmount);
		o.aftermath();
	}
	
	public void getReport(String[][] sArray) throws IOException {
		HashSet<String> date1 = new HashSet<String>();
		
		for(int i = 0; i < sArray.length; i++) {
			date1.add(sArray[i][0].substring(0, 10));
		}
		
		ArrayList<String> date = new ArrayList<String>(date1);
		
		System.out.println(date.size());
	}
}
