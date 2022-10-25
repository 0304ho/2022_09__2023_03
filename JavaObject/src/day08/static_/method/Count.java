package day08.static_.method;

public class Count {
	
	public int a;			//일반변수
	public static int b;	//정적변수
	
	//일반메서드 - 일반변수, 정적변수 둘다 사용가능
	public int some1() {
		a=10;
		return ++b;
	}
	//정적메서드 - 정적변수만 사용가능 (단, 객체 생성을 통해서는 일반변수도 사용 가능)
	public static int some2() {
//		a=10;		//일반변수라 사용 불가능
		Count c = new Count();
		c.a = 10;
		return++b;
	}

}
