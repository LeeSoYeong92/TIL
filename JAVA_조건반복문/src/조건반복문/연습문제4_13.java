package 조건반복문;

public class 연습문제4_13 {
	public static void main(String[] args)
	{
	String value = "12k7k4";
	char ch = ' '; // 답안에서는 ch = value.charAt(i)로 변수 설정을 함.. 이게 훨씬 간단함.
	boolean isNumber = true;
	// charAt(int i) 반복문과 를 이용해서 문자열의 문자를
	// . 하나씩 읽어서 검사한다
	for(int i=0; i < value.length() ;i++) {// 답안은 if(!('0'<=ch && ch<='9')) {isNumber = false; break;}
	 if ( '0' <= value.charAt(i) && value.charAt(i) <= '9') { // 각 문자가 숫자인지 조건문을 통해 검증
	 isNumber = true; 
	 } else {
	  isNumber = false;
	  break; // 중간에 문자가 나오면 바로 break로 for문 나올 수 있도록 작성; 반복문이므로 마지막자리가 숫자면 무조건 boolean은 참이 된다.
	 }
	}
	
	 
	 
	if (isNumber) {
	System.out.println(value+"는 숫자입니다 ."); 
	} else {
	System.out.println(value+"는 숫자가 아닙니다 ."); 
	}
	}}
