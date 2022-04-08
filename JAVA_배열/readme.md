

## □ 배열의 선언과 생성(구조)
##### 배열은 같은 타입의 여러 변수를 하나의 묶음으로 나타내는 것

~~~java
 int[] score; // 배열 선언 int type의 참조 변수 score 선언
 score = new score[4]; // 배열의 생성 '4'의 의미는 배열에 index 4개를 심을 수 있다는 뜻
 int[] score = new score[4]; // 배열의 선언과 생성을 동시에 압축
 int[] score = {7,i,i-1,a,A}; // 배열을 초기화. {}안에 있는 값들은 배열의 index라고 하며 변수,상수,수식,문자를 저장할 수 있다. 
    >> 생성된 배열 예시 
      score[0] | score[1] | score[2] | score[3] | score[4] |
        7      |     i    |    i-1   |     a    |     A    |
~~~        
  *score[n]의 n은 index num이며 0부터 시작한다. 즉 배열의 길이는 총 index의 개수이기에 실제 index num의 마지막 수는 길이-1 이다.*
  
  
<br>

## □ 배열의 출력
##### for문 

~~~java
 int[] score = {100,80,30,70};
  for(i=0; i<score.length;i++){
    System.out.print(score[i]);
    }
  >>실행결과 100803070
~~~
##### 메서드 

~~~java
 int[] score = {100,80,30,70};
 System.out.println(Arrays.toString(score));
~~~


<br>

## □ 배열의 복사
##### for문 

~~~java
 int[] score = {100,80,30,70};
 int[] score2 = new int[2 * score.length];
 for (i=0; i<score.length; i++) {
  score2[i] = score[i];
  }
  
  score = score2; // 기존 참조변수 score가 길이 2배인 배열로 복사생성한 개념임.
~~~
##### 시스템 클래스 

~~~java

System.arraycopy(num, 0, new num, 0, num.length);
 //num 배열의 index 0번부터~ 를 new num 배열의 index 0번부터 num.length만큼 복사한다.
~~~


<br>

## □ 다차원 배열


~~~java
 int[][] score = new int[3][4]; // 3행 4열의 2차원 배열을 생성 
 score[0][2] ->> 1행 3열의 index
 
 
 int[][] score = {{3,4,1},     // 각 행마다 다른 길이로 생성할 수 있음.
                  {1,4,3,5},
                  {3,6,7,3,1}
                  }
 ~~~                   

 *2차원 배열의 index와 length는? <br>
     ✨index : score[0], score[1], score [2] (score[0] = {3,4,1}) <br>
     ✨length : 3*
      
              
                 
 
