package 조건반복문;
	//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class 연습문제4_6 {
	public static void main (String[] args) {
		
		int q = 1;
		int w = 1;
		
		 for(q = 1; q<=6; q++) {
			 for (w = 1; w<=6; w++) {
				 if(w+q == 6) {
					 System.out.printf("a : %d, b : %d%n", q, w);
				 }
			 }
		 }
	}
}
		