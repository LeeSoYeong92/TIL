package ���ǹݺ���;

public class ��������4_13 {
	public static void main(String[] args)
	{
	String value = "12k7k4";
	char ch = ' '; // ��ȿ����� ch = value.charAt(i)�� ���� ������ ��.. �̰� �ξ� ������.
	boolean isNumber = true;
	// charAt(int i) �ݺ����� �� �̿��ؼ� ���ڿ��� ���ڸ�
	// . �ϳ��� �о �˻��Ѵ�
	for(int i=0; i < value.length() ;i++) {// ����� if(!('0'<=ch && ch<='9')) {isNumber = false; break;}
	 if ( '0' <= value.charAt(i) && value.charAt(i) <= '9') { // �� ���ڰ� �������� ���ǹ��� ���� ����
	 isNumber = true; 
	 } else {
	  isNumber = false;
	  break; // �߰��� ���ڰ� ������ �ٷ� break�� for�� ���� �� �ֵ��� �ۼ�; �ݺ����̹Ƿ� �������ڸ��� ���ڸ� ������ boolean�� ���� �ȴ�.
	 }
	}
	
	 
	 
	if (isNumber) {
	System.out.println(value+"�� �����Դϴ� ."); 
	} else {
	System.out.println(value+"�� ���ڰ� �ƴմϴ� ."); 
	}
	}}
