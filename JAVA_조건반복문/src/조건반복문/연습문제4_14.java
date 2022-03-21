package 조건반복문;

public class 연습문제4_14 {

public static void main(String[] args)
{
// 1~100 answer 사이의 임의의 값을 얻어서 에 저장한다
int answer = (int)(Math.random() * 100 + 1); //Math.rancom()은 기본적으로 double 타입이기에 int으로 형변환 필요 시 해줘야 함.
int input = 0; // 사용자입력을 저장할 공간
int count = 0; // 시도횟수를 세기위한 변수
	System.out.println(answer);
// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
java.util.Scanner s = new java.util.Scanner(System.in);
do {
count++;
System.out.print("1과 100 사이의 값을 입력하세요 :"  ); 
input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다

	if (input < answer) {System.out.println("더 큰 수를 입력해 주세요");}
	else if (input > answer) {System.out.println("더 작은 수를 입력해 주세요");}
	else if (input == answer) {System.out.println(count+"번 성공 끝에 맞추셨습니다."); break;}


} while(true); // 무한반복문
}
}
