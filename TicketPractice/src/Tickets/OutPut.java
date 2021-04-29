package Tickets;

public class OutPut {
	
	public void chooseMenu() {
		System.out.printf("메뉴를 선택하시오.\n");
		System.out.printf("1. 티켓 발매\n");
		System.out.printf("2.통계\n");
	}
	
	public void printEntryMenu() {
		System.out.printf("*******************************\n");
		System.out.printf("폴리랜드에 오신것을 환영합니다. \n");
		System.out.printf("\n");
		System.out.printf("*******************************\n");
	}
	
	public void typeAgain() {
		System.out.printf("다시 입력해주세요.\n");
	}
	
	public void ticketChoiceMenu() {
		System.out.printf("티켓권종을 선택하세요.\n");
		System.out.printf("0. 나가기\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
	}
	
	
	public void ssnumInputMenu() { // menu to get social service number 
		System.out.printf("0. 나가기\n");
		System.out.printf("생년월일과 주민번호 뒤의 첫자리 숫자를 입력하세요.\n");
	}
	
	public void discountDetail() {
		System.out.printf("우대사항을 입력하세요.(1인 당 한장의 티켓만 할인됩니다. 다자녀의 경우 자녀 1명의 티켓만 할인됩니다.)\n");
		System.out.printf("0. 나가기\n");
		System.out.printf("1. 없음(나이 우대는 자동으로 처리됩니다)\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부\n");
	}
	
	public void ticketAmount() {
		System.out.printf("0. 나가기\n");
		System.out.printf("티켓 장 수를 입력하세요.\n");
		System.out.printf("(최대 10개까지 가능합니다.)\n");
	}
	
	public void aftermath() {
		System.out.printf("===Result==========================================\n");
		System.out.printf("ticket type = %s\n", Variables.typeskor[0]);
		System.out.printf("age = %s\n", Variables.age);
		System.out.printf("age type = %s\n", Variables.typeskor[1]);
		System.out.printf("discount type = %s\n", Variables.typeskor[2]);
		System.out.printf("total price = %s\n", Variables.typeskor[3]);
		System.out.printf("===================================================\n");
		System.out.printf("\n");
	}
}
