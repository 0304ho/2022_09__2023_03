package day08.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01();	//상속
		c.method02();	//오버라이드
		c.method03();	//내꺼
		
		System.out.println("======다형성======");
		//자식이 부모에 저장 되는데, 부모님 처럼 사용되지만, 자식의 오버라이딩된 메서드가 실행됨
		
		Parent p = c;
		p.method01();
		p.method02();
//		p.method03();	//3번 메서드는 Parent클래스에 없기에 사용 불가능
		System.out.println(p==c);	//동일한 주소값을 나타냄
		
		System.out.println("======클래스 캐스팅======");
		//다형성이 적용되면, 자식이 가지고 있던 본래의 기능을 사용할 수 없기 때문에
		//클래스캐스팅이 가능해진다
		Child cc = (Child)p;
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("----------주의할점----------");
		//다형성이 적용된 객체만 캐스팅이 가능하다
		Parent pp = new Parent();	//Parent로 만들어져서 Child의 기능이 없기에
		Child ccc = (Child)pp;		//ClassCastException이라는 에러가 나옴
		
		
		
		
		
		
	}

}
