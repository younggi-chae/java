package kosta.phone2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 1.추가 2.출력 3.종료
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
							
		while (true) {
			System.out.println("1.추가  2.출력  3.검색  4.수정  5.삭제   6.정렬  7.종료");
			System.out.println("선택 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				m.sortPhoneInfo();
				break;
			case "7":			
				System.out.println("프로그램 종료");
				return;
			} //end switch
		} // end while
	} //end main()
}
