package 조건반복문;
	// 구구단 1-9단까지 곱하기 3까지만 출력하는 코드를 작성하시오.
public class 연습문제4_12 {
	public static void main (String[] args) {
		int i = 1;
		int j = 1;
		
		for (i=1; i<=3; i++) {
			for (j=2; j<=4; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);	
			}
				System.out.println();	
}
		System.out.println();
		
		for (i=1; i<=3; i++) {
			for (j=5; j<=7; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);	
			}
				System.out.println();	
}
		System.out.println();
		for (i=1; i<=3; i++) {
			for (j=8; j<=9; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);	
			}
				System.out.println();	
}
	}
}
		


