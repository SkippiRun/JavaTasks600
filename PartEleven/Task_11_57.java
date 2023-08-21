import java.util.*;
class Task_11_57 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, i;
		System.out.print("Введите первое число: ");
		inpt1 = in.nextInt();
		System.out.println("Start");
		for (i = 1; i <= inpt1; i++) {
		System.out.print(i+"#");
		}
		System.out.println("\nStop");
	}
}
