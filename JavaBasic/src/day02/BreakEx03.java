package day02;

public class BreakEx03 {
	
	public static void main(String[] args) {
		
		//중첩반복문을 탈출하는방법
		//반복문에 이름(label)을 붙이고 break 이름; 을 사용하면 빠져나올수있다
		 /*
		boolean flag = false;		//
		for(char c = 'A' ; c <= 'Z' ; c++) {
			
			for(char l = 'a' ; l <= 'z' ; l++) {
				
				System.out.println(c+ " - " + l);
				
				if(l == 'f') {
					flag = true;
					break;
				}
			}
			if(flag) break;  //flag가 true라면 탈출
		}
		*/
		
		//label : 이름
		ex:for(char c = 'A' ; c <= 'Z' ; c++) {
			
			for(char l = 'a' ; l <= 'z' ; l++) {
				
				System.out.println(c+ " - " + l);
				
				if(l == 'f' ) break ex;
				
			} //inner
		}
		
		
		
		
	}

}
