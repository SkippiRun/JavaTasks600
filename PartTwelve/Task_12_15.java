import java.util.*;
class Task_12_15 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y, down = -20, up = 20, countDivider = 0;
	System.out.print("Введите число: ");
	x = in.nextInt();
	for (int i = x-1; i > 1; i--) {
			//y = down + (int)((up-down+1)*Math.random());
			if (x % i == 0) countDivider++;
		}
		System.out.println("Вы ввели число "+x+" и число делителей этого числа равно "+countDivider);
	}
}
