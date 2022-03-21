package 조건반복문;
	// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) . 의 결과를 계산하시오
public class 연습문제4_3 {
	public static void main (String[] args) {
		
		int i = 0;
		int sum = 0;
		int j = 0;
			for (i = 1; i <= 10; i++) {
				for (j = 1; j <= i; j++) {
					sum = sum + j; // 내부 for문을 벗어나 다시 외부 for문으로 가도 sum 값은 바뀐 채 유지. 
				}	
				System.out.println(sum); // 나의 경우 for 반복문 중첩시켰지만, 단순히 변수 하나를 만들어주면 됐었음.
			}
			 
		int sum2 = 0;
		int num2 = 0;
		 for (i=1; i<=10; i++) {
			 num2 = num2 + i;
			 sum2 = sum2 + num2;
			
			 System.out.println(num2);
			 System.out.println(sum2); // 이런식으로 변수를 하나 더 만들어주면 해결
		 }			
}			
}
