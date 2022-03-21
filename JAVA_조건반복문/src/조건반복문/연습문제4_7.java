package 조건반복문;
  // Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는코드를 완성하라
public class 연습문제4_7 {
	public static void main(String[] args) {
		int value = (int)(6 * Math.random()) + 1; //math.ramdom 메서드는 double type이므로 int type으로 형변환 해줘야 함.
		System.out.println("value:"+value);
		}
}
