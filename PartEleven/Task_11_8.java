import java.util.*;
class Task_11_8 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num , i, down = -20, up = 35;
/*		System.out.println("Введите первое число: ");
		down = in.nextInt();
		System.out.println("Введите второе число: ");
		up = in.nextInt();
		if (up < down) {
			up = down+up;
			down = up - down;
			up = up - down;
		}
*/		for (i=1; i <= 20; i++) {
		num = down + (int)((up-down+1)*Math.random());
		if (num < 0) System.out.println("Сгенерированное число: "+num+"?");
		else System.out.println("Сгенерированное число: "+num);
		}
	}
}
