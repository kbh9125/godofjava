package godofjava;

public class ProfilePrint {

	byte age;
	String name;
	boolean isMarried;
	
	public void setAge(byte age) {
		this.age=age;
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMarried(boolean flag) {
		this.isMarried=flag;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	public static void main(String args[]) {
		ProfilePrint profileprint = new ProfilePrint();
		profileprint.setAge((byte)38);
		profileprint.setName("BangHyun");
		profileprint.setMarried(true);
		
		System.out.println("My name is " + profileprint.getName());
		System.out.println("I'm " + profileprint.getAge() + " years old.");
		System.out.println("I'm Married : " + profileprint.isMarried());
	}
}
