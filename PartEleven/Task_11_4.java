import java.util.*;
class Task_11_4 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int i, x1, x2;
		System.out.println("Введите первое число: ");
		x1 = in.nextInt();
		System.out.println("Первое число: " + x1);
		for (i = 1; i < 5; i++) {
		System.out.println("Введите второе число: ");
		x2 = in.nextInt();
		System.out.println("Второе число: " + x2);
		if (x2 > x1) System.out.println("Второе число больше первого");
		x1=x2;
		System.out.println("Первое число:"+ x1+"\tВторое число: " + x2);
		}
	}
}
