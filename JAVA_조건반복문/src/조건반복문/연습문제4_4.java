package ���ǹݺ���;
	//1+(-2)+3+(-4)+... , �� ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 100 �Ǵ� �� ���Ͻÿ�.

public class ��������4_4 {
	public static void main (String[] args) {
		
		int s = 1; // s�� �ʱ�ȭ
		int sum = 0;
		
		for(int i = 1; sum<=100; i++,s=-s) { // ������ 2�� ���� ����
			
			sum = sum + i*s;	
			
			System.out.println(i);
			System.out.println(sum);
			}		
		}
	}