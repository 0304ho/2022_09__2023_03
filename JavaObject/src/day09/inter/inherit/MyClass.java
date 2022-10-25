package day09.inter.inherit;

public class MyClass implements Inter3{

	@Override
	public void some01() {
		System.out.println("inter1의 some01 오버라이드");
		
	}

	@Override
	public void some02() {
		System.out.println("inter1의 some02 오버라이드");
		
	}

	@Override
	public void some03() {
		System.out.println("inter2의 some03 오버라이드");
		
		
	}

	@Override
	public void some05() {
		System.out.println("inter3의 some05 오버라이드");
		
		
	}

}
