import java.util.*;
class Task_12_16 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y, down = -20, up = 20, countDivider = 0;
	System.out.print("Введите число: ");
	x = in.nextInt();
	for (int i = x-1; i > 1; i--) {
			//y = down + (int)((up-down+1)*Math.random());
			if (x % i == 0) countDivider++;
		}
		if (countDivider == 0) System.out.println("Вы ввели число "+x+" и оно является простым");
		else System.out.println("Вы ввели число "+x+" и число не является простым, количество делителей этого числа равно "+countDivider);
	}
}
