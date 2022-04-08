package 배열;

public class 연습문제5_10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		//문자열 src 의 문자를 charAt() 으로 하나씩 읽어서 변환 후 result에 저장
		
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
				if('a'<= ch && 'z' >= ch) {
					result = result + abcCode[(int)ch - 97]; // 영어 소문자의 아스키 코드가 97부터이므로 97 빼줌. 그냥 'a'를 빼도됨.
				}
				
				else if('0' <= ch && '9' >= ch) {
					result = result + numCode[ch - 48]; // char 숫자의 아스키코드가 48부터이므로 48 빼줌. 그냥 '0'을 빼도 됨.
				}
			}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		
}}
