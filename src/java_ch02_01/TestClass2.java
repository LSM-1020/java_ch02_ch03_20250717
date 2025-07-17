package java_ch02_01;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3; //integer 타입의 hour 변수를 선언하고, 초기값 3으로 초기화
		int minute = 50;
		
		System.out.println("hour");
		System.out.println(hour);
		System.out.println("지금 시간은 " + hour + "시" + minute + "분 입니다.");
		// print는 옆으로 출력, println은 줄바꿔서 출력
		// 괄호에 따움표를 넣으면 text로 출력, 안넣으면 선언값 출력
		
		int totalMinute;
		
		totalMinute = (hour * 60) + minute;
		System.out.println(totalMinute + "분");
		
		
		int a;
		int b;
		
		a = 100;
		b = a; //변수 값 복사
		
		int al = 0b1010; // 2진수
		int a2 = 02010; // 8진수
		int a3 = 0xFFFF; // 16진수
		
		
	}

}
