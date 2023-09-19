import java.util.*;
class Task_15_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a;
	System.out.println("Введите число: ");
	a = in.nextInt();
	while (a != 0) {
		System.out.println("Введите число: ");
		a = in.nextInt();
		if (a > 0) System.out.println("Вы ввели положительное число");
		else if (a < 0) System.out.println("Вы ввели отрицательное число");
		else if (a == 0) System.out.println("Вы ввели ноль");
	}
	}
}
