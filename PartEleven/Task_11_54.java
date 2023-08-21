import java.util.*;
class Task_11_54 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, inpt2, inpt3, i;
		System.out.print("Введите первое число: ");
		inpt1 = in.nextInt();
		System.out.print("Введите второе число: ");
		inpt2 = in.nextInt();
		if (inpt1 > inpt2) {
		inpt3 = inpt1;
		inpt1 = inpt2;
		inpt2 = inpt3;
		}
		System.out.println("Start");
		for (i = inpt1; i <= inpt2; i++) {
		System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
