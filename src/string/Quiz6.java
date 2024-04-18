package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) { // 조건인 참인 동안에 계속 반복(영원히 끝나지않음)
			
			System.out.print("문자열을 입력하세요 :");
			String str =scanner.nextLine();
			
			if (str.equalsIgnoreCase("end")) {
				break;	
			}
			
//			if(str.toLowerCase().equals("end")) { // 체이닝 기법 (함수를 호출하고 다시 함수 호출)
//				break;
//			}
		} 
		// break; 반복문 종료
		// continue 반복문 스킵
	}

}
