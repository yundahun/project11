package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		int i = str.length() - 1;
		while(i >= 0) {
			System.out.print(str.charAt(i));
			i--;
		}
		
		System.out.println();
		
		for (int j = str.length() - 1; j >= 0; j--) {
			System.out.print(str.charAt(j));
		}
	}

}
