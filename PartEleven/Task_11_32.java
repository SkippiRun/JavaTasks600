import java.util.*;
class Task_11_32 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, down = 10, up = 99;

//		System.out.print("Введите цифру: ");
//		num = in.nextInt();
		System.out.println("Start");
//		if (num < 0) num = -num;
		for (i = up; i >= down; i--) {
		if ((i%10) == 7) System.out.println("i = "+i);
		}
		System.out.println("Stop");
	}
}
