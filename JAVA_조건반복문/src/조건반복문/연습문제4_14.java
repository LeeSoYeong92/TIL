package ���ǹݺ���;

public class ��������4_14 {

public static void main(String[] args)
{
// 1~100 answer ������ ������ ���� �� �� �����Ѵ�
int answer = (int)(Math.random() * 100 + 1); //Math.rancom()�� �⺻������ double Ÿ���̱⿡ int���� ����ȯ �ʿ� �� ����� ��.
int input = 0; // ������Է��� ������ ����
int count = 0; // �õ�Ƚ���� �������� ����
	System.out.println(answer);
// Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
java.util.Scanner s = new java.util.Scanner(System.in);
do {
count++;
System.out.print("1�� 100 ������ ���� �Է��ϼ��� :"  ); 
input = s.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�

	if (input < answer) {System.out.println("�� ū ���� �Է��� �ּ���");}
	else if (input > answer) {System.out.println("�� ���� ���� �Է��� �ּ���");}
	else if (input == answer) {System.out.println(count+"�� ���� ���� ���߼̽��ϴ�."); break;}


} while(true); // ���ѹݺ���
}
}
