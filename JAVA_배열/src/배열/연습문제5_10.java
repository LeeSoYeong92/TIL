package �迭;

public class ��������5_10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		//���ڿ� src �� ���ڸ� charAt() ���� �ϳ��� �о ��ȯ �� result�� ����
		
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
				if('a'<= ch && 'z' >= ch) {
					result = result + abcCode[(int)ch - 97]; // ���� �ҹ����� �ƽ�Ű �ڵ尡 97�����̹Ƿ� 97 ����. �׳� 'a'�� ������.
				}
				
				else if('0' <= ch && '9' >= ch) {
					result = result + numCode[ch - 48]; // char ������ �ƽ�Ű�ڵ尡 48�����̹Ƿ� 48 ����. �׳� '0'�� ���� ��.
				}
			}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		
}}
