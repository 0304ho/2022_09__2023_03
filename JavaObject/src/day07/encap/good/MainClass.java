package day07.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		
		
		me.setYear(2022);
		int year = me.getYear();
		System.out.println("년도 : " + year);
		
		me.setMonth(1);
		int month = me.getMonth();
		System.out.println("월 : " + month);
		
		me.setDay(3);
		int day = me.getDay();
		System.out.println(day);
		
		me.setSsn("940616-1111111");
		String ssn = me.getSsn();
		System.out.println(ssn);
		
		me.info();
		
	}
}
