package �迭;
//������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� ����. ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ����϶�
public class ��������5_6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 23310; 
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) { 
			int[] coinCount = new int[coinUnit.length]; //������ ��쿡�� cointUnit�̶�� �迭�� �ϳ� �� ��������� �����ϰ� ������.�����������ڸ� �ᵵ��.
			coinCount[i] = money/coinUnit[i];
			money = money - coinUnit[i]*coinCount[i];
			
			System.out.printf("coinUnit: %d, coinCount: %d%n", coinUnit[i], coinCount[i]);
			
		}
		
		   
		
	}
}
