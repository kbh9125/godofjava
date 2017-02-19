package godofjava;

public class Operators {

	public static void main(String[] args) {
		Operators sample = new Operators() ;
		sample.additive();
		sample.multiplicative();
		sample.remainder() ;
		sample.compound() ;
		sample.unary() ;
		sample.increDecre() ;
		sample.complement() ;
		sample.comparison() ;

	}

	private void additive() {
		System.out.println("Method additive...");
		int intValue1 = 5 ;
		int intValue2 = 10 ;
		
		int result = intValue1 + intValue2 ;
		System.out.println(result);
		// result에 할당되어 있던 더하기 결과는 사라지고, 새로운 결과가 result 변수에 할당
		result = intValue2 - intValue1 ;
		System.out.println(result);
		
	}

	private void multiplicative() {
		System.out.println("Method multiplicative...");
		int intValue1 = 5 ;
		int intValue2 = 10 ;
		
		int result = intValue1 * intValue2 ;
		System.out.println(result);
		result = intValue2 / intValue1 ;
		System.out.println(result);
		result = intValue1 / intValue2 ;
		System.out.println(result);
		// float 형 변환
		float result2 = (float) intValue1 / intValue2 ;
		System.out.println(result2);
	}

	private void remainder() {
		System.out.println("Method remainder...");
		int intValue1 = 53 ;
		int intValue2 = 10 ;
		int intValue3 = 50 ;
		int result = intValue1 % intValue2 ;
		System.out.println(result);
		int result2 = intValue3 % intValue2 ;
		System.out.println(result2);
	}

	private void compound() {
		System.out.println("Method compound...");
		int intValue1 = 10 ;
		intValue1 += 5 ;
		System.out.println(intValue1);
		intValue1 -= 5 ;
		System.out.println(intValue1);
		intValue1 *= 5 ;
		System.out.println(intValue1);
		intValue1 /= 5 ;
		System.out.println(intValue1);
		intValue1 %= 5 ;
		System.out.println(intValue1);
	}

	private void unary() {
		// 단항연산자
		System.out.println("Method unary...");
		int intValue = -10 ;
		int result = +intValue ;
		System.out.println(result);
		result = -intValue ;
		System.out.println(result);
		intValue++ ;
		System.out.println(intValue);
		intValue-- ;
		System.out.println(intValue);		
	}

	private void increDecre() {
		// ++연산자를 앞에 붙이기, 뒤에 붙이기 -> 결과값이 다르다
		System.out.println("Method unary...");
		int intValue = 1 ;
		// 결과를 출력한 후에 1을 더한다.
		System.out.println(intValue++);
		System.out.println(intValue);
		// 출력하기 전에 1을 더한다.
		System.out.println(++intValue);
	}

	private void complement() {
		// !연산자 : boolean 타입에서만 이 연산자를 사용할 수 있다.
		System.out.println("Method complement...");
		boolean flag = true ;
		System.out.println(flag);
		System.out.println(!flag);
	}

	private void comparison() {
		// == != 연산자
		System.out.println("Method comparison...");
		int intValue1 = 1 ;
		int intValue2 = 2 ;
		int intValue3 = 1 ;
		System.out.println(intValue1==intValue2);
		System.out.println(intValue1==intValue3);
		
		System.out.println(intValue1!=intValue2);
		System.out.println(intValue1!=intValue3);
		
		System.out.println("--------------------");
		
		// 실제 타입은 다르다고 하더라도, 숫자끼리 비교는 가능
		char charValue = 'a';
		System.out.println(97==charValue);
		double doubleValue = 1.0 ;
		System.out.println(intValue1==doubleValue);
		
		// boolean값끼리 비교 가능? 테스트... 가능..
		boolean booleanValue = true ;
		System.out.println(true==booleanValue);
	}
	
}
