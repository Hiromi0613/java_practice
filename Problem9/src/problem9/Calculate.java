package problem9;

interface CalculateBase {
	public void calculate(int x, int y);
	public void show();
}

public class Calculate implements CalculateBase {
	int x;
	int y;
	int operator;
	
	public void calculate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setOperator(int operator) {
		this.operator = operator;
	}
	
	public void show() {
		if(operator == 1) {
			System.out.println(x + "+" + y + "=" + (x + y));
		} else if(operator == 2) {
			System.out.println(x + "-" + y + "=" + (x - y));
		} else if(operator == 3) {
			System.out.println(x + "/" + y + "=" + (x / y));
		} else if(operator == 4) {
			System.out.println(x + "*" + y + "=" + (x * y));
		}
	}
}
