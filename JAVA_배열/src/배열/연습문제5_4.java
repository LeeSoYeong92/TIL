package �迭;
// 2���� �迭 �� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ� 

public class ��������5_4 {
	public static void main(String[] args) 
	{ 
		int[][] arr = { 
				{ 5, 5, 5, 5, 5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30}
			}; 
		int total = 0; 
		float average = 0;
		int n = 0;
	
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j<arr[i].length; j++) {
			 total += arr[i][j]; 
		 	}
		 n += arr[i].length; 
		 // 1���� �迭���� ���̰� �ٸ� �� �ֱ� ������ �ش��ڵ�� �ۼ������� ���� ���� ���̰� ��� �Ȱ��ٸ� arr.length*arr[0].length�� n���� ���ص� �ȴ�.
		 average = total/n;
	 	}

	
	System.out.println("total="+total); 
	System.out.println("average="+average); 
}}
