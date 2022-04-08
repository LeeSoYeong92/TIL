package 배열;
	//배열의 값을 모두 더하는 코드를 작성하라.
public class 연습문제5_3 {
	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
			
		}
		System.out.println("sum="+sum);
	}

}
