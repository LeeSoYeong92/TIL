package 조건반복문;
	//1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 되는 지 구하시오.

public class 연습문제4_4 {
	public static void main (String[] args) {
		
		int s = 1; // s값 초기화
		int sum = 0;
		
		for(int i = 1; sum<=100; i++,s=-s) { // 증감식 2개 설정 가능
			
			sum = sum + i*s;	
			
			System.out.println(i);
			System.out.println(sum);
			}		
		}
	}