package day07.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		//변수를 public으로 만들어두면,
		//잘못된값이 저장될 수 있다.
		
		MyBirth me = new MyBirth();
		me.year = 2023;
		me.month = 13;
		me.day = 32;
		me.ssn = "아무값";
		
		me.info();
	}

}
