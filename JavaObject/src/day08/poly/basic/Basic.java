package day08.poly.basic;

//하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
//단, 파일명과 동일한 클래스가 public이어야 합니다.
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}



public class Basic {
	//사용자 클래스
	
	//다형서 = 자식의 주소가 부모에 저장되는 성질
	//멤버변수
	
	A a = new B();
	A a1 = new C();
	A a2 = new D();
	A a3 = new E();
	//다형성은 상속을 전제로함
	//B b = new C();
	
	//object형에는 모든 클래스를 저장할 수 있다.
	
	Object obj;
	Object obj2 = 3.14;
	Object obj3 = "문자열";
	Object obj4 = new A();
			
	
	

}
