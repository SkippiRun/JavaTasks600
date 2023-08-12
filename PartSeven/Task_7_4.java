import java.util.*;
class Task_7_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите число ");
	int a = in.nextInt();
	int x;
	x = a%100;
	if (a==x) System.out.println("Ok");
	else System.out.println("No");
}
}
