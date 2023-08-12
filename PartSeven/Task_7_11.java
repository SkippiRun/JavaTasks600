import java.util.*;
class Task_7_11 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите первое число ");
	double a = in.nextDouble();

	System.out.print("Введите второе число ");
	double b = in.nextDouble();

	if (a > b) System.out.println (b+" "+a);
	else if (a == b)System.out.println("a == b");
	else System.out.println(a+" "+b);
}
}
