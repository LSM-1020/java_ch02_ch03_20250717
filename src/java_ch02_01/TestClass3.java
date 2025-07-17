package java_ch02_01;

public class TestClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1; // char은 한글자씩 저장 가능
		ch1 = 'A';// char은 저장할 문자를 작은따움표로 묶어야 함 , 큰따움표는 error발생
		
		char ch2;
		ch2 = '가';
		
		char ch3 = '6';
		System.out.println(ch3);
		
		char ch4 = 65;
		System.out.println(ch4);
		ch1 = 65; // 숫자도 저장 가능함 65=A, 작은따움표x
		
		///////////////////////////////////////////
		
		String ch5 = "kor"; // String은 문자열, 첫글자 대문자, class
		
		String str1 = "오늘은 비가 많이 옵니다. \n내일은 맑으면 좋겠습니다."; // \n은 줄바꾸기
		System.out.println(str1);
		
		boolean b1 = true;
		boolean b2 = false;
		
	}

}
