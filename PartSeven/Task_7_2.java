import java.util.*;
class Task_7_2 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите двузначное число ");
	int a = in.nextInt();
	int d = a/10;
	int f = a%10;
	if (d == f) System.out.println("Цифра десятков и цифра единиц равны ");
	else System.out.println("Цифра десяткои и цифра единиц не равны");
}
}
