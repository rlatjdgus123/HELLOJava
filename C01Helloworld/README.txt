[Helloworld]

[문제1] JDK와 JRE의 차이점을 설명한 것 중 틀린 것은?
1. JDK는 JRE와 컴파일러 등의 개발 도구가 포함된다.
2. 자바 프로그램을 개발하려면 JDK 반드시 필요하다.
3. 자바 프로그램을 실행만 하려면 JRE를 설치해도 상관없다.
4. JRE에는 컴파일러(javac.exe)가 포함되어 있다.
정답: 4번
해설:
  - JDK(Java Development Kit) 개발용 도구
  - JRE(Java Runtime Environment) 자바 실행 환경

[문제2] JVM에 대한 설명으로 틀린 것은?
1. JVM은 java.exe 명령어에 의해 구동된다.
2. JVM은 바이트 코드를 기계어로 변환시키고 실행한다.
3. JVM은 운영체제에 독립적이다.(운영체체별로 동일한 JVM이 사용된다)
4. 바이트 코드는 JVM에 독립적이지만 JVM은 운영체제에 종속적이다.
정답: 3번 
해설:
  - JVM(Java Virtual Machine) 자바 가상 머신
  
[문제3] 자바 프로그램 개발 과정을 순서대로 나열하세요.
1. javac.exe로 바이트 코드 파일(*.class)을 생성한다. (컴파일)
2. java.exe로 JVM을 구동시킨다. (실행)
3. 자바 소스 파일(*.java)을 작성한다. (코드작성)
4. JVM은 main() 메소드를 찾아 메소드 블록을 실행시킨다. (구동)
정답: 3 -> 1 -> 2 -> 4
  
[문제4] 자바 소스 파일을 작성할 때 틀린 것은 무엇인가?
1. 자바 소스 파일명과 클래스 이름은 대소문자가 동일해야 한다.
   Hello.java, class Hello
2. 클래스 블록과 메소드 블록은 반드시 중괄호 {}로 감싸야 한다.
3. 실행문 뒤에는 반드시 세미콜론(;)을 붙여야 한다.
4. 주석은 문자열 안에도 작성할 수 있다.
   "문자열은 쌍따옴표로 감싼다"
정답: 4번
설명: 문자열 안에 주석을 넣어도 문자열로 인식을 한다.
  
[문제5] 자바 주석문의 종료가 아닌 것은?
1. // : 행주석
2. /* ... */ : 범위주석
3. /** ... */ : API 도큐먼트 주석
4. <!-- ... --> : 범위주석
정답: 4번
해석: HTML 주석

[문제6] 이클립스에 대한 설명으로 틀린 것은?
1. 이클립스는 JDK(JRE)를 설치해야만 실행할 수 있다.
2. 이클립스에서 소스 파일을 저장하면 자동 컴파일되어 바이트 코드 파일이 생성된다.
3. 워크스페이스는 프로젝트들이 생성되는 기본 디렉토리를 말한다.
4. .metadata는 프로젝트의 소스 파일들이 저장되는 디렉토리이다.
정답: 4번


