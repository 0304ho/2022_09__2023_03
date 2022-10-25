package day08.poly.instanceof_;

public class Person {
	
	String name;
	int age;
	
//	Person(){
//		this("honggilsoon",1);
//		
//	}
	
	Person(String name){
		this(name,1);
	}
	
	Person(String name, int age){
		super();
		this.name = name.toUpperCase();
		this.age = age;

		
	}

	
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	

}
