package day07.encap.obj;

public class Hotel {
	
	public Chef chef;	// = new Chef();
	
	//생성자
	public Hotel() {
		 
	}
		
	//생성자 = 클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter, setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
}
