package day09.abs.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		//1. 추상클래스는 객체 생성이 안됩니다.
		//   반드시 자식으로 구체화 됩니다
		

		Store s = new SeoulStore();		//클래스 추상화 (부모클래스에 자식클래스 내용을 넣음)
		s.apple();
		s.melon();
		s.orange();
		System.out.println(s.getName());	//상속받은
		
		Store b = new BusanStore();
		b.apple();
		b.melon();
		b.orange();
		System.out.println(b.getName());
		
		
	}

}
