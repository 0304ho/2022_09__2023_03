package day07.modi.protec.pac1;

public class A {
	 /*
	  * Protected는 기본적으로 같은 패키지에서만 사용할 수 있다.(Default랑 동일)
	  * 단, 패키지가 다르더라도 상속관계에선 super을 통한 접근은 가능함
	  * 
	  */
	
	protected String s;
	
	protected A() {
		
	}
	protected void method() {
		
	}
}
