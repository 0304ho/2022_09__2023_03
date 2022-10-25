package api.lang.system;

public class SystemEx {
	
	public static void main(String[] args) {
		
//		System.exit(0);
//		System.gc();
		long start = System.currentTimeMillis();
		System.out.println(start);
		//1970 /01/01 이후 현재까지의 지나온 시간을 밀리초로 리턴
		long sum = 0;
		for(long i = 0; i<=10000000000L; i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println((end-start)*0.001+"초 소요됨");
		
	
	}

}
