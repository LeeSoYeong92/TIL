package �迭;
/*�־��� 2���� �迭�� �����ͺ��� ���ο� ���η� 1�� �� ū �迭�� �����ؼ� �迭  
�� ��� ���� ������ ��ҿ� �� ���� ���� ������ �����ϰ� ����ϴ� ���α׷��̴�. (1)
�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
*/
public class ��������5_11 {
	
		public static void main(String[] args)
		{
		int[][] score = {
			{100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
	     };
		
		int sumi = 0;
		int sumj = 0;
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
			
				result[i][j] = score[i][j];  
				result[i][result[0].length-1] += result[i][j];
				
				result[result.length-1][j] += result[i][j];
				result[result.length-1][result[0].length-1] += result[i][j];
			}
			
		}
		
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		 }

}}
