package �迭;
//������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴� �� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ� 

public class ��������5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
				
	for(int x=0;x < 20;x++) {
		int i = (int)(Math.random() * ballArr.length); 
		int j = (int)(Math.random() * ballArr.length); 
		int tmp = 0;
		
		tmp = ballArr[i]; // ���� ���� ������ ���� ���ԵǴ� ����.
		ballArr[i] = ballArr[j];
		ballArr[j] = tmp;
		
	}

		System.arraycopy(ballArr, 0, ball3, 0, 3); 
		
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]); 
		}
	}}