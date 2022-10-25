package day08.poly.basic2;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department){
		super(name,age);
//		super();
//		this.name = name;
//		this.age = age;
		this.department = department;
	}
	
	String info() {
		//super.메서드 () = 오버라이딩된 메서드에서 부모님의 원형 메서드가 필요할때 사용
		return super.info() + ", 부서 : " + department ;
	}
	

}
