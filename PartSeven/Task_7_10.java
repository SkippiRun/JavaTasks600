import java.util.*;
class Task_7_10 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	int a = in.nextInt();

	if (a < 0) {
		a = -a;
		System.out.println("a = " + a);
	}
	else {
		a = 0;
		 System.out.println("a = " + a);
	}
}
}
