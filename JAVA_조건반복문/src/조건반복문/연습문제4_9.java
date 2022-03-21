package 조건반복문;
//숫자로 이루어진 문자열이 있을때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라 만일 문자열str이 "12345" 라면 ‘1+2+3+4+5’ 결과인 15 출력되어야 한다 
public class 연습문제4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
		 sum = sum + str.charAt(i) - 48; // char 문자로 숫자코드로 변환됨. 그래서 48을 빼줬지만 문자 '0'을 빼도됨.
		 System.out.println(sum);
		}
		System.out.println("sum="+sum);
		}

}
