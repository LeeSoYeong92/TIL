package �迭;
/*������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*��
�� �� �׷����� �׸��� ���α׷��̴� �� �˸��� �ڵ带 �־ �ϼ��Ͻÿ� . (1)~(2) .
*/
public class ��������5_8 {

		public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
				counter[answer[i]-1]++; // answer�迭�� ���� Ȥ�� ��Ģ���� ������ �ڵ� �۵� �ȵ�.
			}
	
		for(int i=0; i < counter.length;i++) {
			for(int j=0; j < counter[i]; j++) {
				System.out.print("*");
			}
		
		System.out.println();
		}

}}
