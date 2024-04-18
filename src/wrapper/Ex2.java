package wrapper;

public class Ex2 {

	public static void main(String[] args) {
		
		Integer iNum1 = new Integer(100);
		
		Integer iNum2 = 100; // new Integer(100)로 변화. (오토박싱)
		
		int num1 = iNum1.intValue();
		
		int num2 = iNum1; // iNum1.intValue() 호출. (언박싱)
		
		// 참조형과 기본형간의 연산
		int num3 = iNum1 + 100; // iNum1.intValue() + num2
		System.out.println("num3: " + num3);
		
		// Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; // 오토박싱으로 객체 생성
		
		boolean bool1 = boolean1.booleanValue(); // boolean값 꺼내기
		boolean bool2 = boolean2; // 언박싱으로 값 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		// Character 클래스
		Character character1 = new Character('A');
		Character Character2 = 'B'; // 오토박싱으로 객체 생성
		
		char char1 = character1.charValue(); // char값 꺼내기
		char char2 = Character2; // 언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
	}

}
