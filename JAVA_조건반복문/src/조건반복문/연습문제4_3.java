package ���ǹݺ���;
	// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) . �� ����� ����Ͻÿ�
public class ��������4_3 {
	public static void main (String[] args) {
		
		int i = 0;
		int sum = 0;
		int j = 0;
			for (i = 1; i <= 10; i++) {
				for (j = 1; j <= i; j++) {
					sum = sum + j; // ���� for���� ��� �ٽ� �ܺ� for������ ���� sum ���� �ٲ� ä ����. 
				}	
				System.out.println(sum); // ���� ��� for �ݺ��� ��ø��������, �ܼ��� ���� �ϳ��� ������ָ� �ƾ���.
			}
			 
		int sum2 = 0;
		int num2 = 0;
		 for (i=1; i<=10; i++) {
			 num2 = num2 + i;
			 sum2 = sum2 + num2;
			
			 System.out.println(num2);
			 System.out.println(sum2); // �̷������� ������ �ϳ� �� ������ָ� �ذ�
		 }			
}			
}
