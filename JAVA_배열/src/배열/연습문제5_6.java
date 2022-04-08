package 배열;
//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제. 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라
public class 연습문제5_6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 23310; 
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) { 
			int[] coinCount = new int[coinUnit.length]; //나같은 경우에는 cointUnit이라는 배열을 하나 더 만들었지만 간단하게 나눗셈.나머지연산자만 써도됨.
			coinCount[i] = money/coinUnit[i];
			money = money - coinUnit[i]*coinCount[i];
			
			System.out.printf("coinUnit: %d, coinCount: %d%n", coinUnit[i], coinCount[i]);
			
		}
		
		   
		
	}
}
