package ���ǹݺ���;

public class ��������4_2 {
	public static void main (String[] args) {
		//1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ� .  
		
		int i = 0;
		int sum = 0;
			
		for (i = 0; i <= 20; ++i)  {
			if (i%2 != 0 && i%3 != 0) 
		   sum = sum + i; //�ѹ����� ��� if�� {} ��������
}
		
		System.out.println(sum);
}
}
