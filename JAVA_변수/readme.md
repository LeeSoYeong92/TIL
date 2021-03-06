# Variable 변수

  ### 변수의 의의
    변수 : 값을 저장하는 공간
     example) int A = 31; // int : 변수타입, A : 변수, 31 : 리터럴(변수 A의 값)
              final long B = 1324L; // final : 키워드(변수 타입 앞 키워드 넣으며 B를 상수로) , long : 타입 , B : 상수, 1234L : 리터럴
              
  ### 변수의 명명규칙
    1. 예약어 사용 금지
    2. 대소문자 구분 가능
    3. 특수문자는 $,_만 가능
    4. 숫자로 시작 금지
  
  ### 변수의 타입
  
    1.자료형 (기본형/참조형) 
    2.참조형 : 기본형이 아닌 모든 타입
       example ) Date today = new Date(); // Date 변수타입, today 변수 (참조형의 기본값은 null or 객체주소(4byte/8byte)
       
       
  ### 기본형
| 값   | 분류 | 타입   | 크기  | 리터럴          |접미사|저장가능한 범위|
| -----|------| ------|------ |------         |------| ------|
| 논리 | -   | boolean|1byte  |     |     |true, false |
| 문자 | -   | char   |2byte  |'A', 'K'       || 0~ 2^16-1 |
| 숫자 | 정수 | byte   |1byte |123, 813, 1b701|| -2^7 ~ 2^7-1 |
|      |     | short  |2byte  |123, 813, 1b701|| -2^15 ~ 2^15-1 |
|     |      | int    |4byte  |123, 813, 1b701|| -2^31 ~ 2^31-1 |
|      |      | long  |8byte  |123, 813, 1b701|l |-2^63 ~ 2^63-1 |
|숫자  | 실수 | float | 4byte |3.14, 1.4f, 3.0e-7|f | 1.4e-45 ~3.4e38 |
|    | 실수 | double  | 8byte |3.14, 1.4d, 3.0e-7|d(생략이 디폴트) | 4.9e-324 ~ 1.8e308 |

 >1bit = 2진수의 한자리 (0/1) & 1byte = 8bit
 
 
 
   ### 형변환
    변수 또는 상수의 타입을 다른 타입으로 변환하는 것
    
     example) double d = 31.888;
              int age = (int)d;
       >>>> double은 실수형 int는 정수형으로 출력 시 d의 값이 int타입으로 형변환되어 31이란 값을 출력
       

   ### 형변환 규칙
     변수 타입과 리터럴 타입이 불일치할 때
      >>>변수 타입이 리터럴 타입보다 저장 범위가 더 넓은 타입이면 가능, 좁으면 에러 발생
      >>>변수 타입에 리터럴값이 저장 가능한 범위 넘어섰을 때도 에러 발생
  
        example ) int A = 'D' // 문자 D의 코드NO로 변환하여 A에 저장 (OK) 
                  double = 1.342f (ok) // float보다 double이 저장범위가 넓기에 가능
                  int i = 0x3848588; (에러//int 저장범위 초과)
             
             
    
