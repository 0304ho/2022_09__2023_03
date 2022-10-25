package day08.poly.basic2;


public class MainClass {

	public static void main(String[] args) {

		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "123123");

		Teacher t = new Teacher("홍길자",30,"프로그램");

		Employee e = new Employee("홍길순",40,"취업지원");

		//		Object[] arr = {s, t, e};
		Person[] arr = {s, t, e};

		for(Person p : arr) {
			System.out.println(p.info());	//자식클래스의 오버라이딩된 메서드가 실행됨
		}

		//		MainClass c = new MainClass();
		//		c.printInfo(s);
		//		c.printInfo(t);
		//		c.printInfo(e);

		printInfo(s);
		printInfo(t);
		printInfo(e);
		
		
		House h = new House();
		h.setPerson(s);		//스투던트 저장
		h.setPerson(t);		//티쳐 저장
		h.setPerson(e);		//임플로이 저장

		Person[] ar = h.getParr();
		
		for(Person p : ar) {
			if(p==null) break;		//배열에 값이 없으면 탈출
			System.out.println(p.info());
		}

	}


	public static void printInfo(Person p) {	//부모타입 매개변수
		p.info();

	}

}
