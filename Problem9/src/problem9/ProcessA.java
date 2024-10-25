package problem9;

public class ProcessA extends Process {
	public ProcessA(String str,int age) {
		name = str;
		super.age = age;
	}
	
	public void run() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}

}