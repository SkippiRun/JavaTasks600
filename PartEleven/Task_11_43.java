import java.util.*;
class Task_11_43 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, num, i, down = 100, up = 999;

		System.out.println("Start");
		for (i = 10; i <= 99; i++) {
//		if (i == 0) System.out.println("Zero");
		if (((i%10)%3 == 0) && ((i/10)%3 == 0)) System.out.println(i);
		}
		System.out.println("Stop");
	}
}
