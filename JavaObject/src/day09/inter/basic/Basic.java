package day09.inter.basic;

//인터페이스는 implements 키워드로 상속을 받음
public class Basic /* extends Object  */ implements Inter1, Inter2
{


	public void method01() {
		System.out.println("오버라이딩 된 메서드 1번");
	}

	public void method02() {
		System.out.println("오버라이딩 된 메서드 2번");
	}

}
