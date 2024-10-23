package test9;

interface Process {
	abstract void check(String name, int age);
	abstract void run();
}

public class ProcessA implements Process {
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/** 条件チェックの結果 */
	private int judgement;
	
	/**
	 * checkメソッド
	 * 受け取ったString型の引数nameを変数xに代入する
	 * 受け取ったintg型の引数ageを変数ageに代入する
	 * 変数nameの文字数、変数ageの値によって、
	 * 条件チェックの結果を変数judgementに代入する
	 * @param name 名前の引数
	 * @param age 年齢の引数
	 */
	public void check(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(name.length() < 10 && age >= 0 && age <= 140) {
			this.judgement = 1;
		} else if(name.length() >= 10 && (age < 0 || age > 140)){
			this.judgement = 2;
		} else if(name.length() >= 10) {
			this.judgement = 3;
		} else if(age < 0 || age > 140) {
			this.judgement = 4;
		}
	}
	
	/**
	 * runメソッド
	 * 変数judgementの値によって、結果を出力する
	 */
	public void run() {
		switch(judgement) {
		   case 1:
			   System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
			   break;
		   case 2:
			   System.out.println("名前を10文字未満で入力し、年齢を正しく入力してください。");
			   break;
		   case 3:
			   System.out.println("名前を10文字未満で入力してください。");
			   break;
		   case 4:
			   System.out.println("年齢を正しく入力してください。");
			   break;
		}
	}
}