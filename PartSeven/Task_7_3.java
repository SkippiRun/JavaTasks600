import java.util.*;
class Task_7_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите первое число ");
	int a = in.nextInt();

	System.out.print("Введите второе число ");
	int b = in.nextInt();

	if ((a%3) == (b%4)) System.out.println(a-b);
	else System.out.println(b-a);
}
}
