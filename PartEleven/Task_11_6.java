import java.util.*;
class Task_11_6 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num , i, up, down;
		System.out.println("Введите первое число: ");
		down = in.nextInt();
		System.out.println("Введите второе число, большее первого: ");
		up = in.nextInt();
		for (i=1; i <= 20; i++) {
		num = down + (int)((up-down+1)*Math.random());
		System.out.println("Сгенерированное число: "+num);
		}
	}
}
