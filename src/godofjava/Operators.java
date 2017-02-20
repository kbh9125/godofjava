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
        sample.comparison2() ;
        sample.condition();
        sample.doBlindDate(30);
        sample.doBlindDate(80);
        sample.casting();

	}

    private void casting() {
        System.out.println("Method casting...");
	    byte byteValue = 127 ;
	    short shortValue = byteValue ;
        System.out.println(byteValue);
        System.out.println(shortValue);

	    shortValue++;
        System.out.println(shortValue);
        // byte로 형변환한다는 것은 short앞에 있는 1바이트를 그냥 버린다
        byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }

    private boolean doBlindDate(int point) {
        System.out.println("Method doBlindDate...");
	    boolean doBlindDateFlag = false ;
	    doBlindDateFlag = (point>=80) ? true : false ;
	    System.out.println(point + " : " + doBlindDateFlag);
	    return  doBlindDateFlag;
    }

    private void condition() {
        System.out.println("Method condition...");
	    boolean x = true ;
	    boolean y = true ;
	    System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("--------");
        x = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("--------");
    }

    private void additive() {
		System.out.println("Method additive...");
		int intValue1 = 5 ;
		int intValue2 = 10 ;
		
		int result = intValue1 + intValue2 ;
		System.out.println(result);
		// result¿¡ ÇÒ´çµÇ¾î ÀÖ´ø ´õÇÏ±â °á°ú´Â »ç¶óÁö°í, »õ·Î¿î °á°ú°¡ result º¯¼ö¿¡ ÇÒ´ç
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
		// float Çü º¯È¯
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
		// ´ÜÇ×¿¬»êÀÚ
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
		// ++¿¬»êÀÚ¸¦ ¾Õ¿¡ ºÙÀÌ±â, µÚ¿¡ ºÙÀÌ±â -> °á°ú°ªÀÌ ´Ù¸£´Ù
		System.out.println("Method unary...");
		int intValue = 1 ;
		// °á°ú¸¦ Ãâ·ÂÇÑ ÈÄ¿¡ 1À» ´õÇÑ´Ù.
		System.out.println(intValue++);
		System.out.println(intValue);
		// Ãâ·ÂÇÏ±â Àü¿¡ 1À» ´õÇÑ´Ù.
		System.out.println(++intValue);
	}

	private void complement() {
		// !¿¬»êÀÚ : boolean Å¸ÀÔ¿¡¼­¸¸ ÀÌ ¿¬»êÀÚ¸¦ »ç¿ëÇÒ ¼ö ÀÖ´Ù.
		System.out.println("Method complement...");
		boolean flag = true ;
		System.out.println(flag);
		System.out.println(!flag);
	}

	private void comparison() {
		// == != ¿¬»êÀÚ
		System.out.println("Method comparison...");
		int intValue1 = 1 ;
		int intValue2 = 2 ;
		int intValue3 = 1 ;
		System.out.println(intValue1==intValue2);
		System.out.println(intValue1==intValue3);
		
		System.out.println(intValue1!=intValue2);
		System.out.println(intValue1!=intValue3);
		
		System.out.println("--------------------");
		
		// ½ÇÁ¦ Å¸ÀÔÀº ´Ù¸£´Ù°í ÇÏ´õ¶óµµ, ¼ýÀÚ³¢¸® ºñ±³´Â °¡´É
		char charValue = 'a';
		System.out.println(97==charValue);
		double doubleValue = 1.0 ;
		System.out.println(intValue1==doubleValue);
		
		// boolean°ª³¢¸® ºñ±³ °¡´É? Å×½ºÆ®... °¡´É..
		boolean booleanValue = true ;
		System.out.println(true==booleanValue);
	}

    private void comparison2() {
        System.out.println("Method comparison2...");
        int intValue1 = 1 ;
        int intValue2 = 2 ;
        System.out.println(intValue1 > intValue2) ;
        System.out.println(intValue1 < intValue2) ;

        System.out.println(intValue1 >= intValue2) ;
        System.out.println(intValue1 <= intValue2) ;
    }

}
