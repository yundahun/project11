package wrapper;
/* 
 * 정수 10을 문자열 변수에 저장
 * 실수 1.123을 문자열 변수에 저장
 * 문자 c를 문자열 변수에 저장
 * boolean타입의 true값을 문자열 변수에 저장
 */
public class Quiz2 {

	public static void main(String[] args) {
		
		// 숫자를 문자열로 변환하려면 "toString" 메소드를 사용해야함
		String str1 = Integer.toString(10); // 10 -> "10"
		
		String str2 = Double.toString(10.0);
		
		String str3 = Character.toString('C');
		
		String str4 = Boolean.toString(true);
		
		
		String str5 = String.valueOf(10);
		
		String str6 = String.valueOf(1.123);
		
		String str7 = String.valueOf('C');
		
		String str8 = String.valueOf(true);
		
	}

}
