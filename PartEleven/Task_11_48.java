import java.util.*;
class Task_11_48 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, i;
		System.out.print("Enter a two-digit num: ");
		inpt = in.nextInt();
		System.out.println("Start");
		for (i = 100; i <= 999; i++) {
		if ((i%100) == (inpt%100)) System.out.println(i);
		}
		System.out.println("Stop");
	}
}
