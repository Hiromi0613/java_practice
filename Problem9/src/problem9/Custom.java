package problem9;

public class Custom {
	String str1;
	
	public void setBr(String str) {
		this.str1 = str; 
	}
	
	public String toString() {
		String str2 = this.str1 + "です。";
		return str2;
	}
}