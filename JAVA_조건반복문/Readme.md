조건문
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
