package day05;

public class ObjectBasic02 {
	
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		System.out.println("===1번 계산기===");
		System.out.println(cal.add(1));
		System.out.println(cal.add(2));
		System.out.println(cal.add(3));

		
		Calculator cal2 = new Calculator();
		System.out.println("===2번 계산기===");
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
		System.out.println(cal2.add(300));
		
		
	}

}