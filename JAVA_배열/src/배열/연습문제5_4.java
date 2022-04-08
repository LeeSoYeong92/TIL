package 배열;
// 2차원 배열 에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오 

public class 연습문제5_4 {
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
		 // 1차원 배열마다 길이가 다를 수 있기 때문에 해당코드로 작성했으나 만약 열의 길이가 모두 똑같다면 arr.length*arr[0].length로 n값을 구해도 된다.
		 average = total/n;
	 	}

	
	System.out.println("total="+total); 
	System.out.println("average="+average); 
}}
