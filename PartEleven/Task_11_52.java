import java.util.*;
class Task_11_52 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, i;
		System.out.print("Enter a num: ");
		inpt = in.nextInt();
		System.out.println("Start");
		for (i = inpt; i >= 1; i--) {
		System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
