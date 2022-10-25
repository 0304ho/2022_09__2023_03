package day06.inherit.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();	//부모님클래스
		p.age = 10;
		p.name = "부모님";
		System.out.println(p.info());
		
		Student s = new Student();
		s.age = 20;
		s.name= "홍길자 Student";
		s.studentId = "123123";
		
		System.out.println( s.info() + " 학번 : " + s.studentId );
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신 Subject";
		t.subject = "역사";
		System.out.println( t.info() + " 과목 : " + t.subject );
		
		Employee e = new Employee();
		e.age = 20;
		e.name="홍길동 Employee";
		e.department = "인사팀";
		System.out.println( e.info() + " 부서 : " + e.department );
		
	}

}
