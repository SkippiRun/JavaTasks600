import java.util.*;
class Task_7_5 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	int a = in.nextInt();
	if (a > 0) System.out.println("Число положительное");
	else if (a < 0) System.out.println("Число отрицательное");
	else if (a == 0) System.out.println("Число равно нулю");
}
}
