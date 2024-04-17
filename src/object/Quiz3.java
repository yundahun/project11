package object;

public class Quiz3 {

	public static void main(String[] args) {
	
		Dog dog = new Dog("멍멍이", "진돗개");
		
		System.out.println(dog);
		System.out.println(dog.toString());
	}
}
// 강아지 클래스
class Dog {
	
	String name;
	String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + "]";
	}
}