package day06.override;

public class Child extends Parent {

	int method02() {
		System.out.println("자식의 오버리이딩 된 2번 메서드");
		return 100;
	}
	
	void method03() {
		System.out.println("자식의 3번 메서드");
	}
	
	
}
