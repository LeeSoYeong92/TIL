package 조건반복문;

public class 연습문제4_5 {

		//for(int i=0; i<=10; i++) {
		//for(int j=0; j<=i; j++)
		//System.out.print("*");
		//System.out.println();
	
	//다음 for문을 while문으로 변환하시오.
	
	public static void main (String[] args) {
		
		int i = 1;
		int j = 1;
		
		while(i<=10) {
			for(j=1; j<=i; j++) {
			 System.out.print("*"); //print는 가로로 출력 줄바꿈 안됨.
		}
			i++; // i 증감은 외부반복문에서 해야 함.내부에 입력 시 for문 안에서 무한반복 됨.
			System.out.println();
	}
}
}
