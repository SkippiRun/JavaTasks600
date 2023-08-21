import java.util.*;
class Task_11_25 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i;
		System.out.print("Введите число: ");
		num = in.nextInt();
		System.out.println("Start");
		if (num < 0) num = -num;
		for (i = 0; i <= num; i++) {
		System.out.print(i+" "+(-i)+" \t");
		}
		System.out.println("\nStop");
	}
}
