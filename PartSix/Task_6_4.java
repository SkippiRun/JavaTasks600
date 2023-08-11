import java.util.*;
class Task_6_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	int x = in.nextInt();
	if (x > 0) {
		x*=2;
		System.out.println("Ваше число " + x);
	}
}
}
