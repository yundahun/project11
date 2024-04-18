package wrapper;
/*
 * 문자열 "10"을 byte, short, int, long 으로 변환
 * 문자열 "10.0"을 float.double로 변환
 * */
public class Quiz1 {

	public static void main(String[] args) {

		// 문자열을 숫자로 변환하려면 "parse" 메소드를 사용해야함
		Byte bNum = Byte.parseByte("10");
		Short sNum = Short.parseShort("10");
		Integer iNum = Integer.parseInt("10");
		Long lNum = Long.parseLong("10");
		
		Float fNum = Float.parseFloat("10.0");
		Double dNum = Double.parseDouble("10.0");
		
	}

}
