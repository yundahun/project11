package string;

/*
 *  getCharCount("자바 프로그래밍 입문") -> 9  이름 // 매개변수 // 반환값
 */
public class Quiz4 {

	public static void main(String[] args) {

		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다"));

	}

//	public static void(반환타입) getCharCount(매개변수)  // 일단 와꾸(얼굴) 만들어 놓기
	public static int getCharCount(String str) {

		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {

			// 공백도 문자로 취급함
			if (str.charAt(i) != ' ') {
				cnt++;
			}
		}
		return cnt; // 결과값
	}
}
