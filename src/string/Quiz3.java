package string;

public class Quiz3 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";
		
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			// 공백도 문자로 취급함
			if (str.charAt(i) != ' ') {
				cnt++;
			}
		}
		System.out.println(str.length());
		System.out.println(cnt);
	}

}
