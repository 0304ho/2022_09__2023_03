package day05;

public class Phone {
	
	//멤버변수 선언
	String model;
	int price;
	String color;
	
	//생성자  
	//1. 클래스가 객체로 처음생설될때 불려나가는 친구
	//2. 이름이 클래스명과 동일(대/소문자까지)해야한다
	//3. 생성자를 만들지 않으면 자동으로 생성해줌
	
	Phone(){
		System.out.println("생성자 호출됨");
		model = "애니콜";
		price = 1000;
		color = "빨강";
	}
	//생성자는 여러개 일 수 있다. 하지만 모형이 달라야함
	//생성자를 여러개를 만드는것은 생성자 오버로딩이라고함
	Phone(String pModel){
		System.out.println("생성자 호출됨");
		model = pModel;
		price = 2000;
		color = "블루";
	}
	
	Phone(String pModel, int pPrice){
		model = pModel;
		price = pPrice;
		color = "블랙";
	}
	
	Phone(int pPrice, String pModel ){
		model = pModel;
		price = pPrice;
		color = "화이트";
	}
	
	Phone(String pModel, int pPrice, String pColor){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	
	void info(){
		System.out.println("===폰의 정보===");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
	}

}
