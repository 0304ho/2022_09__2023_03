package day07.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		//(Chef chef = new Chef()를 줄여서 하는법)
//		hotel.setChef(new Chef());
		
		//위랑 동일함
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
		
		System.out.println(c==chef);
		chef.cooking();
		
		
	}

}
