import java.util.*;
class Task_11_42 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, num, i, down = 100, up = 999;

		System.out.println("Start");
		for (i = -999; i <= 999; i++) {
		if (i == 0) System.out.println("Zero");
		else if (i%((i/100)+(i%10)+((i%100)/10)) == 0) System.out.println(i);
		}
		System.out.println("Stop");
	}
}
