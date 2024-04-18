package wrapper;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		
		String num2 = sc.nextLine();
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println("두 수의 합:" + sum);
		System.out.println(num1 + num2); // 문자열 결합
		
		
	}
}
