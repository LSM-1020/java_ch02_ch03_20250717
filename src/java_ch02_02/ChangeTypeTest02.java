package java_ch02_02;

public class ChangeTypeTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteVar1 = 50; // -128 ~127 1바이트 상수 타입
		int intVar1; // 4바이트 상수 타입
		
		intVar1 = byteVar1; //자동 타입 변환 , 오른쪽이 왼쪽으로 대입
		
		short shortVar1; //shortVar1 = intVar1; //순서 확인, 실행x
		shortVar1 = (short) intVar1; //강제 형변환(casting), 작은범위의 연산자를 사용하여 강제로 변환시킴
		
		byte bv1;
		bv1 =  (byte) shortVar1;
		
		char charVar1;
		charVar1 = (char) intVar1;
	
		double doubleVar1 = 3.14;
		double doubleVar2;
		int intVar2;
		int intVar3 = 100;
		
		intVar2 = (int) doubleVar1; // 3-> 강제로 형변환이 되지만 소수점은 절삭되어 정수로 변환되어 출력
		doubleVar2 = intVar3;
		
		 ///////////////////////////////////////
		 
		double doubleVar3 = 314; //314.0
		
		int intVar;
        //intVar4 = 4.0; // 반대로 정수에 .0을 넣으면 에러가 발생
		
//		100 + 3.14 //정수와 실수의 연산 -> 실수
//		100 + 3.0 // .0이 들어가는 실수와 연산이 된다면 무조건 실수
		
		//즉 double로 연산자
		double doubleVar4 = 100 + 3.14; // 103.14이 출력
		
//		int intVar5 = 100 + 3.14; // 103이 출력
		
		int intVar6 = 5 / 3; // 값은 1.666 이지만 int이기때문에 소숫점은 버리고 정수인 1만 저장됨
		
		double doubleVar5 = 5 / 3; // 실수연산자인 double 이지만 정수와 정수의 계산이므로 1.666이 출력되지않고 1만 출력됨
								   // double로 나타내고 싶으면 값 하나를 .0을 붙여주어 정수와 실수의 계산으로 만들어줌
		
		int intValue = 10;
		String str = "11";
		
		System.out.println(intValue + "11"); // 숫자 + 문자는 문자로 인식됨 1101
		
		
		
	}	

}
