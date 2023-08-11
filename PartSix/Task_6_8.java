import java.util.*;
class Task_6_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	int x, y;
	System.out.print("Введите первое целое положительное число ");
	x = in.nextInt();
	System.out.print("Введите второе целое положительное число ");
	y = in.nextInt();

	if (x > y) System.out.println(x+y);
	else if (x < y) System.out.println(x*y);
	else System.out.println("Числа равны");

}
}
