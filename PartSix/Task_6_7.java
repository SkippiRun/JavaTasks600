import java.util.*;
class Task_6_7 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	int x;
	System.out.print("Введите целое положительное число ");
	x = in.nextInt();


	if ((x > 0) && (x <= 999)) {
	System.out.println("Вы ввели положительное число");
	System.out.println("Это значит, что ваше число уменьшается на 1");
	System.out.println("Ваше число " + (x-1));
	}
}
}
