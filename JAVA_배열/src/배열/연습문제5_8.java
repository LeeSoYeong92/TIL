package 배열;
/*다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
을 찍어서 그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 . (1)~(2) .
*/
public class 연습문제5_8 {

		public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
				counter[answer[i]-1]++; // answer배열이 연속 혹은 규칙성이 없으면 코드 작동 안됨.
			}
	
		for(int i=0; i < counter.length;i++) {
			for(int j=0; j < counter[i]; j++) {
				System.out.print("*");
			}
		
		System.out.println();
		}

}}
