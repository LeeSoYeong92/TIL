package ���ǹݺ���;
	//�� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ��������4_6 {
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
		