import java.util.*;
class Task_11_53 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, inpt2, i;
		System.out.print("Введите меньшее число: ");
		inpt1 = in.nextInt();
		System.out.print("Введите большее число: ");
		inpt2 = in.nextInt();
		System.out.println("Start");
		for (i = inpt1; i <= inpt2; i++) {
		System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
