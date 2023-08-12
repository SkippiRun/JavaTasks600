import java.util.*;
class Task_7_6 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите первое число ");
	int a = in.nextInt();

	System.out.print("Введите второе число ");
	int b = in.nextInt();

	if (a == b) System.out.println("a == b");
	else if (a > b)System.out.println("a > b");
	else if (a < b)System.out.println("a < b");
}
}
