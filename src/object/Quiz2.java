package object;

public class Quiz2 {

	public static void main(String[] args) {
		
		
		Object obj = new Student(1001, "둘리");
		
		if (obj instanceof Student) {
			Student student = (Student) obj;
			
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}
	}

}
