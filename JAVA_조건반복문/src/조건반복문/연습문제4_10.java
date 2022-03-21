package 조건반복문;
	// int타입의 변수 num 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라 만일 변수num 의 값이 12345라면 ‘1+2+3+4+5’ = 15 의 결과를 출력하라
public class 연습문제4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
		 sum = sum + num%10 ;
		 num = num/10;
		 System.out.println(sum);
		 System.out.println(num);
		 }
		
		System.out.println("sum="+sum);
	}
}
