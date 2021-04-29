package Tickets;

public class Collections {
	static final String[][] ticketPrices = 
		{{"babyTicketPriceNight", "37000"}, {"babyTicketPriceDay", "44000"},
		{"teenTicketPriceNight","40000"},{"teenTicketPriceDay","47000"},
		{"adultTicketPriceNight","46000"},{"adultTicketPriceDay","56000"},
		{"elderTicketPriceNight","37000"},{"elderTicketPriceDay","44000"}};
	
	static final String[][] DiscountRate = 
		{{"noneDiscountRate", "1"},
		{"disabledDiscountRate","0.40"},
		{"patriotsDiscountRate","0.50"},
		{"childrenDiscountRate", "0.20"},
		{"pregnantDiscountRate","0.15"}};
	
	static final String route = "C:\\Users\\Sam\\Desktop\\amusementPark.csv";
	static final String head = "Date, Ticket Type (day/night), Age, Amount, Total Prices, Discount Type";
//		static int babyTicketPriceNight = 37000;
//		static int babyTicketPriceDay = babyTicketPriceNight + 7000;
//		static int teenTicketPriceNight = 40000;
//		static int teenTicketPriceDay = teenTicketPriceNight + 7000;
//		static int adultTicketPriceNight = 46000;
//		static int adultTicketPriceDay = adultTicketPriceNight + 10000;
//		static int elderTicketPriceNight = 37000;
//		static int elderTicketPriceDay = elderTicketPriceNight + 7000;
	
//	 	static double noneDiscountRate = 1;
//		static double disabledDiscountRate = 0.40;	// 장애인 40% 2
//		static double patriotsDiscountRate = 0.50;	// 국가유공자 50% 3
//		static double childrenDiscountRate = 0.20;	// 다자녀 20% 4
//		static double pregnantDiscountRate = 0.15;	// 임산부 15% 5 

// 		3~12 소인
// 		13~18 청소년
// 		65이상 경로
//		대인 19~64
}
