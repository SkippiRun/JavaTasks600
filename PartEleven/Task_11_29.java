import java.util.*;
class Task_11_29 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, down = 100, up = 999;

		System.out.print("Введите цифру: ");
		num = in.nextInt();
		System.out.println("Start");
		if (num < 0) num = -num;
		for (i = down; i <= up; i++) {
		if (i%10 == num) System.out.print("i = "+i+"\t");
		}
		System.out.println("\nStop");
	}
}
