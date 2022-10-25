package day05;

public class PenMain {
	
	public static void main(String[] args) {
		
		//펜의 기능을 사용할때는 객체로 생성하고,
		//참조연산자(.)를 사용
		Pen pen = new Pen();
		pen.color = "블랙";
		pen.price = 1000;
		pen.company = "모나미";
		
		pen.write();
		pen.info();
		
		System.out.println();
		System.out.println();
		
		
		Pen redPen = new Pen();
		redPen.color = "빨간색";
		redPen.price = 1000;
		redPen.company = "모나미";
		
		redPen.write();
		redPen.info();
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(1000));
		
		
		
	}

}
