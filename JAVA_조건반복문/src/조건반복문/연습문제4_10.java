package ���ǹݺ���;
	// intŸ���� ���� num �� ���� �� �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶� ���� ����num �� ���� 12345��� ��1+2+3+4+5�� = 15 �� ����� ����϶�
public class ��������4_10 {
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
