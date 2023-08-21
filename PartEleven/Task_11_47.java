import java.util.*;
class Task_11_47 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, num, i, a, b , c, y;
		double x;
		System.out.println("Start");
		for (i = 100; i <= 999; i++) {
		a = i/100;
		b = i%100/10;
		c = i%10;
		inpt = c*100 + b*10 + a;
		y = i*inpt;
		x = Math.sqrt(y);
		if ((x%1 == 0) && (x != inpt) && (b != 0) && (c != 0)) System.out.println(i);
		}
		System.out.println("Stop");
	}
}
