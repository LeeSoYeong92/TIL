package 조건반복문;
	//회문수가 맞는 지 코드를 작성하시오.
public class 연습문제4_15 {
	public static void main(String[] args)
	{
	int number = 12324;
	int tmp = number;
	int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
	while(tmp !=0) {	
		result = result*10 + tmp%10;
		tmp /= 10;
		System.out.println(result);
	}
	if(number == result)
	System.out.println( number + "는 회문수 입니다 ."); 
	else
	System.out.println( number + "는 회문수가 아닙니다 ."); 
	} 
}
