package day06.overload;

public class MainClass {
	public static void main(String[] args) {
	
	Basic b = new Basic();

	b.input(1);
	b.input("홍길동");
	b.input("홍길동",1);
	b.input(1,"홍길동");
	b.input(0.1,0.1,1);
	
	
	}

}
