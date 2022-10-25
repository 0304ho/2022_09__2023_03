package day09.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//animal과 ipet에서 받은 모든걸 사용가능
		Dog d = new Dog();
		d.eat();
		d.play();
		
		//animal클래스에 있는 eat만 사용가능
		Animal dd =  new Dog();
		dd.eat();
		
		//IPet클래스에 있는 play만 사용가능
		IPet ddd = new Dog();
		ddd.play();
		
		//Animal(클래스)타입
		Animal baduk =  new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		System.out.println("===========================");
		//1. Animal배열에 저장
		
		Animal[] arr = {baduk,nabi,hodol};
		
		for(Animal a : arr) {
			a.eat();
		}
		//2. 바둑이는 Animal이지만 생성된 클래스가 인터페이스를 상속을 받고 있다면, 상호형변환이 됩니다. 
		
		IPet i1 =(IPet)arr[0];
		IPet i2 =(IPet)nabi;
		IPet i3 = new GoldFish();
		IPet[] arr2 = {i1,i2,i3};
		
		for(IPet i : arr2) {
			i.play();
		}
		
		System.out.println("===========================");
		PetHouse.typeIPet(i3);
		
		PetHouse.arrIPet(arr2);
		
	}

}
