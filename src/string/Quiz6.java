package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("문자열을 입력하세요 :");
			String str =scanner.nextLine();
			
			if (str.equalsIgnoreCase("end")) {
				break;	
			}
		} 
	}

}
