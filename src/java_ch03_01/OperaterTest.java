package java_ch03_01;

public class OperaterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		
		score = score + 10; // 오른쪽 항을 왼쪽에 대입
		
		int a = 0;
//		a = a + 1;
		int b = 10;
//		b = b - 1;
		
		a++; // a = a + 1, 증가연산자
		b--; // b = b - 1, 감소연산자
		
		int x = 1;
		int y = 1;
		int z = 2;
		
		int result1 = x++ + 10; 
		// 증감연산자가 오른쪽이면 x++: 후위 증가 → 현재 값을 먼저 사용하고, 그 후에 1 증가시킴
		// result값은 11로 나오지만(뒤쪽계산먼저 진행되어 result로 저장) x값은 2로 나옴
		int result2 = ++y +10;
		// 증감연산자가 왼쪽이면 ++y: 전위 증가 → 먼저 1 증가시키고, 그 값을 사용함
		int result3 = ++y + z++ + 10; 
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	
		System.out.println(17 / 3); // 몫을 나타냄 -> 5
		System.out.println(17 % 3); // 나머지 연산자 -> 2
		
		int kor = 90;
		int eng = 85;
		int math = 70;
		int sci = 50;
		
		//국영수중 1과목이라도 90점 이상이면 "우수"
		if(kor >= 90 || eng >= 90 || math >= 90 ) { //if 괄호 조건식 중괄호, 괄호 조건에 따라서 중괄호값이 참이면 실행 아니면 실행x
			System.out.println("우수");
		// &&은 and, ||는 or 
		}	
	    if(kor < 60 || eng < 60 || math < 60 || sci < 60 ) { //if 괄호 조건식 중괄호, 괄호 조건에 따라서 중괄호값이 참이면 실행 아니면 실행x
				System.out.println("과락");
		}
	    if(!(kor < 60 && eng < 60 && math < 60 && sci < 60 )) { //if 괄호 조건식 중괄호, 괄호 조건에 따라서 중괄호값이 참이면 실행 아니면 실행x
			System.out.println("과락");
	    }
		
		
		
		
		
		
	}
	
}
