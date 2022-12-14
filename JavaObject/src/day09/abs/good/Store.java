package day09.abs.good;

public abstract class Store {
	/*
	 * 1. 메서드에 abstract를 붙이면 추상 메서드가 됩니다. ( {}중괄호가 없는 메서드 )
	 * 2. 추상메서드를 사용하고싶다면, 추상클래스가 되어야 합니다. (필수)
	 * 
	 */
	
	public abstract void apple();
	public abstract void melon();
	public abstract void orange();
	
	//추상클래스에서도 멤버변수, 생성자, 일반메서드 전부 다 사용가능
	//멤버변수
	private String name = "호식이네";
	
	//생성자
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	//일반메서드 (getter setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
