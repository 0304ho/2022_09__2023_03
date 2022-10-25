package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길동";
		char a = s.charAt(0);
		System.out.println(a);
		
		//길 문자를 찾으면 위치반환, 못찾으면 -1 반환
		int index = s.indexOf("길");
		System.out.println("길위치 : " + index);
		
		//replace(); - 문자열 변환		원본문자는 유지
		CharSequence ss = "sdf";
		String result = s.replace("길","");
		System.out.println("결과 : "  + result);
		System.out.println("원본문자열 : " + s);
		
		//substring();
		String s2 = "오늘은 날씨가 추워요";
		String result2 = s2.substring(4);
		System.out.println(result2); // 4번인덱스 미만 절삭
		
		String result3 = s2.substring(4,8);
		System.out.println("결과 : " + result3);
		
		//trim();
		System.out.println("    홍길도오       ".trim()); 
		
		//split();
		String[] result4 = s2.split(" ");
		System.out.println(Arrays.toString(result4));
		String[] result5 = "010-1234-5678".split("-",2);
		System.out.println(Arrays.toString(result5));
		
		//문자열 포함여부
		if(s.contains("홍")) System.out.println("홍이 포함됨");
		
		String result6 = String.copyValueOf(new char[] {'a','b','c'});
		System.out.println(result6);
		
		String result7 = String.valueOf(3);
		System.out.println("문자열바뀐결과 : " + result7);
		
		
		
		
		
	}
}
