1.조건문
======
## □If문 
##### If(조건식){} : 조건식이 참일 때 괄호{}을 실행
~~~java
 If(int A >= 3) {
  System.out.println("Hi");
 }
~~~
##### If(조건식){} else{} : 조건식이 참이면 If 괄호를 거짓이면 else 괄호를 실행
~~~java
 If(int A >= 3) {
  System.out.println("Hi");
 } else {
   System.out.println("Hello");
 }
~~~
##### If(조건식1){} else if(조건식2){} else if(조건식3){} else {} : 조건식1부터 순차적으로 실행하여 참일경우 해당 if문 괄호 실행 후 If문 탈출
~~~java
 If(int A >= 8) {
  System.out.println("Top");
 } else if(int A < 8 && A > 5) {
   System.out.println("Mid");
 } else if(int A <= 5) {
   System.out.println("Bottom");
 } else { // 조건문이 모두 거짓일 시 else 괄호 실행
   System.out.println("잘못입력하셨습니다");
 }
~~~
##### 중첩 If문 If(조건식1){ If(조건식2){}···} If안의 If문
~~~java
 If(int A > B) {
  If(int B == C) { // If 바깥문의 안쪽 If문으로 A > B &&  B==C 일 경우에 괄호 실행하는 개념임.
   System.out.println("바보");
   } else if(int B == D) {
    System.out.println("천재");
    }
 } else {System.out.println("멍청이");
 }
 ~~~

## □Switch문
##### Switch(조건식){ Case 값 1 : 실행문 Case 값 2 : 실행문···} Switch의 조건식 결과와 같은 값을 가지는 Case의 괄호를 실행
~~~java
  Switch(A - B) { // switch문의 조건식 결과는 반드시 정수 or 문자열이여야만 함.
   Case 1 : System.out.println("나머지는 1입니다."); 
   break; // 값이 1이면 실행문을 출력하고 break를 통해 Switch문을 벗어남.
   Case 0 : System.out.println("나머지는 0입니다.");
   break;
   default : System.out.println("잘못된 값입니다."); // 모든 case 값이 맞지 않을 경우 실행
  }

~~~

2.반복문
======
## □for문 
##### for(초기화;조건식;증감식){} 조건식이 참일 경우 {}실행 하고 증감식 수행, 조건식이 참일 때까지 루트 반복
~~~java
 for(int i = 1; i <= 10; i++) {
  for(int j = 1; j < i; j++) { // for문의 경우에도 중복문 가능
   sum += j;
   }
  System.out.println(sum);
  }
  ~~~
  
## □while문
##### while(조건식) {} 조건식이 참일 경우 괄호 반복
~~~java
 while (i--!== 0 ) { // 증감식이 전위형일 경우 조건식에 반영한 후 참거짓을 따지고 후위형의 경우 그 반대임.
  System.out.println(*****); // i가 1일 때 조건식 실행 시 0이 되지만 후위형이므로 그 전에 참거짓을 따지므로 괄호를 실행한다.
  }
  ~~~
  
##### do{} while() while의 ()조건식이 참일 때까지 do의 괄호 반복
~~~java
 do {
  system.println("A가 B보다 작습니다"); // do while문의 경우 while의 조건식의 참거짓을 떠나 첫번째 do 문은 무조건 실행한다.
 } while (A < B);
 
 
 
