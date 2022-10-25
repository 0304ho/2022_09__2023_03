package day07.encap.good;

public class MyBirth {
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때 클래스 설계자가 만들어 놓은
	 * getter & setter 메서드를 사용합니다.
	 * 
	 * ------------국룰------------------
	 * 메서드명이
	 * get시작(값을 얻는다)
	 * set시작(값을 저장한다)
	 * 
	 *  Setter메서드
	 * 1. 값을 저장하는 메서드
	 * 2. public으로 선언하고 set + 멤버변수명으로 저장
	 * 3. ex) public void setYear(int year){ }
	 * 
	 */
	
	public void setYear(int year) {
		if(year>2022 || year<1900) {
			System.out.println("년도는 1900~2022년까지 입니다.");
		}else {
			this.year = year;
		}
	}
	
	/*
	 * Getter메서드
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고 get + 멤버변수 명으로 지정
	 * 3. ex) public int getYear(){ }
	 * 
	 */
	
	public int getYear() {
		return year; 
	}
	
	/*
	 * month, day, ssn에 대한 getter setter생성
	 * month = 1~12월
	 * day = 1~31일
	 * ssn은 -제거하고 13자리까지
	 */
	
	public void setMonth(int month) {
		if(month<0 || month>12) {
			System.out.println("월은 1~12월 까지 입니다.");
		}else {
			this.month = month;
		}
	}
	public int getMonth() {
		return month;
	}

	
	public void setDay(int day) {
		if(day<0 || day>31) {
			System.out.println("1~31일 사이가 아닙니다.");
		}else {
			this.day = day;
		}
	}
	public int getDay() {
		return day;
	}
	
	
	public void setSsn( String ssn) {
		if(ssn.replaceAll("[^0-9]", "").length()!=13) {
			System.out.println("13자리가 아닙니다.");
		}else {
			this.ssn = ssn;
		}
	}
	public String getSsn() {
		return ssn;
	}
	
	
	public void info() {
		System.out.println(year +  " 년도, "+ month + "월, " + day  + "일 " );
		System.out.println("주민번호 : " + ssn);
	}
	
}
