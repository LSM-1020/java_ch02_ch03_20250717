package java_ch02_02;

public class WrapClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "100000"; //문자열
//		int money = (int) str; 문자열은 숫자로 강제 형변환이 안됨
		int money = Integer.parseInt(str); // 문자열 숫자를 정수로 변환하는 방법
		double money2 = Double.parseDouble(str); // 문자열 숫자를 실수로 변환하는 방법
		
		int score = 77;
		String str2 = String.valueOf(score); // 정수에서 문자열로 변환
		
		System.out.printf("내가 좋아하는 돈의 액수는 %d원과 %.2f원 입니다", money, money2); 
		// printf는 중간에 값을 넣기에 용이함, 정수를 받는 자리는 %d, 실수를 받는 자리는 %f 문자를 받는 자리는 %s .숫자f%로 자릿수 설정		
	
	}
	
	
	

}
