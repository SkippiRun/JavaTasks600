import java.util.*;
class Task_6_2 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	double x = in.nextDouble();
	if (x < 0) System.out.println("x < 0");
	if (x == 0) System.out.println("x == 0");
	if (x > 0) System.out.println("x > 0");
	System.out.println("Завершено ");
}
}
