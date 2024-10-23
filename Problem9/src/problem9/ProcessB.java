package problem9;

public class ProcessB extends Process {
	public ProcessB(String str,int age) {
		name = str;
		super.age = age;
	}
	public void run() {
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
	}	
}