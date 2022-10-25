package day09.inter.basic3;

public class PetHouse {
	
	//IPet타입을 받아서 기능을 출력하는 메서드
	public static void typeIPet(IPet i) {
		i.play();
		
	}
	
	//IPet[]타입을 받아서 기능을 전부 출력하는 메서드
	public static void arrIPet(IPet[] arr) {
		for(IPet i : arr) {
			i.play();
		}
	}
	
}
