package ���ǹݺ���;

public class ��������4_5 {

		//for(int i=0; i<=10; i++) {
		//for(int j=0; j<=i; j++)
		//System.out.print("*");
		//System.out.println();
	
	//���� for���� while������ ��ȯ�Ͻÿ�.
	
	public static void main (String[] args) {
		
		int i = 1;
		int j = 1;
		
		while(i<=10) {
			for(j=1; j<=i; j++) {
			 System.out.print("*"); //print�� ���η� ��� �ٹٲ� �ȵ�.
		}
			i++; // i ������ �ܺιݺ������� �ؾ� ��.���ο� �Է� �� for�� �ȿ��� ���ѹݺ� ��.
			System.out.println();
	}
}
}
