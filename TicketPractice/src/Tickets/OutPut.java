package Tickets;

public class OutPut {
	
	public void printEntryMenu() {
		System.out.printf("*******************************\n");
		System.out.printf("폴리랜드에 오신것을 환영합니다. \n");
		System.out.printf("\n");
		System.out.printf("*******************************\n");
	}
	
	public void ticketChoiceMenu() {
		System.out.printf("티켓권종을 선택하세요.\n");
		System.out.printf("0. 나가기\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
	}
	
	public void ssnumInputMenu() { // menu to get social service number 
		System.out.printf("0. 나가기\n");
		System.out.printf("주민번호를 입력하세요.\n('-'를 제외하고 입력해주세요.)\n");
	}
	
	public void discountDetail() {
		System.out.printf("우대사항을 입력하세요.\n");
		System.out.printf("0. 나가기\n");
		System.out.printf("1. 없음(나이 우대는 자동으로 처리됩니다)\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부\n");
	}
	
	public void ticketAmount() {
		System.out.printf("티켓 장 수를 입력하세요.\n");
	}
	
	public void aftermath() {
		
	}
}
