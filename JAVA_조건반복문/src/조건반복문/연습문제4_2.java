package 조건반복문;

public class 연습문제4_2 {
	public static void main (String[] args) {
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오 .  
		
		int i = 0;
		int sum = 0;
			
		for (i = 0; i <= 20; ++i)  {
			if (i%2 != 0 && i%3 != 0) 
		   sum = sum + i; //한문장일 경우 if의 {} 생략가능
}
		
		System.out.println(sum);
}
}
