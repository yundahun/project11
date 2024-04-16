package object;

public class Quiz1 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2024, 4, 16);
		MyDate date2 = new MyDate(2024, 4, 16);
		
		
		MyDate date3 = new MyDate(2024, 4, 16);
		MyDate date4 = new MyDate(2024, 4, 17);
		
		if (date1.equals(date2)) {
			System.out.println("date1과 date2의 날짜는 같습니다.");
		} else {
			System.out.println("date1과 date2의 날짜는 다릅니다.");
		}
		
		if (date1 == date2) {
			System.out.println("date1과 date2의 날짜는 같습니다.");
		} else {
			System.out.println("date1과 date2의 날짜는 다릅니다.");
		}
		
		if (date3.equals(date4)) {
			System.out.println("date3과 date4의 날짜는 같습니다.");
		} else {
			System.out.println("date3과 date4의 날짜는 다릅니다.");
		}
	}

}

class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			
			MyDate date = (MyDate) obj;
			
			if((this.year == date.year) && (this.month == date.month) && (this.day == date.day)) {
				return true;
			} 
		}
		return false;
	}
}

	
	