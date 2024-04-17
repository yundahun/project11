package string;

public class Quiz2 {

	public static void main(String[] args) {
		
		String str = "881120-1068234";
		String str1 = "001120-4025431";
		
		char gender = str.charAt(7);
		
		if (gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		}		
	}
}
