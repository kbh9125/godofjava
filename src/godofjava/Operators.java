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
		// result�� �Ҵ�Ǿ� �ִ� ���ϱ� ����� �������, ���ο� ����� result ������ �Ҵ�
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
		// float �� ��ȯ
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
		// ���׿�����
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
		// ++�����ڸ� �տ� ���̱�, �ڿ� ���̱� -> ������� �ٸ���
		System.out.println("Method unary...");
		int intValue = 1 ;
		// ����� ����� �Ŀ� 1�� ���Ѵ�.
		System.out.println(intValue++);
		System.out.println(intValue);
		// ����ϱ� ���� 1�� ���Ѵ�.
		System.out.println(++intValue);
	}

	private void complement() {
		// !������ : boolean Ÿ�Կ����� �� �����ڸ� ����� �� �ִ�.
		System.out.println("Method complement...");
		boolean flag = true ;
		System.out.println(flag);
		System.out.println(!flag);
	}

	private void comparison() {
		// == != ������
		System.out.println("Method comparison...");
		int intValue1 = 1 ;
		int intValue2 = 2 ;
		int intValue3 = 1 ;
		System.out.println(intValue1==intValue2);
		System.out.println(intValue1==intValue3);
		
		System.out.println(intValue1!=intValue2);
		System.out.println(intValue1!=intValue3);
		
		System.out.println("--------------------");
		
		// ���� Ÿ���� �ٸ��ٰ� �ϴ���, ���ڳ��� �񱳴� ����
		char charValue = 'a';
		System.out.println(97==charValue);
		double doubleValue = 1.0 ;
		System.out.println(intValue1==doubleValue);
		
		// boolean������ �� ����? �׽�Ʈ... ����..
		boolean booleanValue = true ;
		System.out.println(true==booleanValue);
	}
	
}
