import java.util.*;
class Task_12_17 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y, down = -20, up = 20, countDividerX = 0, countDividerY = 0;
	System.out.print("Введите первое число: ");
	x = in.nextInt();
	System.out.print("Введите второе число: ");
	y = in.nextInt();
	for (int i = x-1; i > 1; i--) {
			//y = down + (int)((up-down+1)*Math.random());
			if (x % i == 0) countDividerX++;
		}
	for (int i = y-1; i > 1; i--) {
			//y = down + (int)((up-down+1)*Math.random());
			if (y % i == 0) countDividerY++;
		}
		if (countDividerX == countDividerY) {
			System.out.print("Вы ввели числа "+x+" и "+y);
			System.out.println(" и они имеют одинаковое число делителей "+countDividerX);
		}
		else {
			System.out.print("Вы ввели числа "+x+" и "+y);
			System.out.println(" и они имеют разное число делителей");
			System.out.println("Для первого числа число делителей равно "+countDividerX);
			System.out.println("Для второго числа число делителей равно "+countDividerY);
		}
	}
}
