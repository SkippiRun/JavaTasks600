import java.util.*;
class Task_12_14 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int y, down = -20, up = 20, n = 10, countZero = 0, countNegative = 0, countPositive = 0;
		for (int i = 0; i < n; i++) {
			y = down + (int)((up-down+1)*Math.random());
			if (y < 0) countNegative++;
			else if (y > 0) countPositive++;
			else countZero ++;
		}
		if (countNegative == countPositive) System.out.println("Серия является уравновешенной");
		else System.out.println("Серия не является уравновешенной");
		System.out.println("countZero = "+countZero+"\tcountNegative = "+countNegative+"\tcountPositive = "+countPositive);
	}
}
