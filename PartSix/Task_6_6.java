import java.util.*;
class Task_6_6 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	int x = in.nextInt();
	if (x > 0) System.out.println("Вы ввели положительное число");
	if (x == 0) System.out.println("Вы ввели число равное нулю");
	if (x < 0) System.out.println("Вы ввели отрицательное число");
}
}
