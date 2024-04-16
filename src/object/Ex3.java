package object;

public class Ex3 {

	public static void main(String[] args) {

		
		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		
		
		// 비교연산자는 메모리 주소로 비교. (100번지 == 200번지)
		if (student1 == student2) { // 주소값과 주소값, 100번지 == 200번지
			System.out.println("student1과 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다.");
		}
		
		// equals 메소드는 오버라이드 돼서, 학생의 학번으로 비교. (1001 == 1001)
		if (student1.equals(student2)) { // 내용과 내용 equals를 재정의 해야함
			System.out.println("student1과 student2는 같은 학생입니다.");
		} else {
			System.out.println("student1과 student2는 다른 학생입니다.");
		}
	}

}

// 학생클래스
class Student {
	
	int id; // 학번
	String name; // 학생의 이름
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			
			Student student = (Student) obj;
			
			if(this.id == student.id) {
				return true;
			}
		}
		
		return false;
	}
}