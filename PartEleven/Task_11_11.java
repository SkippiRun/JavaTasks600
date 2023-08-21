import java.util.*;
class Task_11_11 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num , i, down = 10, up = 99;
/*		System.out.println("Введите первое число: ");
		down = in.nextInt();
		System.out.println("Введите второе число: ");
		up = in.nextInt();
		if (up < down) {
			up = down+up;
			down = up - down;
			up = up - down;
		}
*/		for (i = 1; i < 12; i++) {
		num = down + (int)((up-down+1)*Math.random());
		if (num % 5 == 0) System.out.println("Сгенерированное число: "+num+"\tСумма цифр числа: "+((num/10)+(num%10)));
		else System.out.println("Сгенерированное число: "+num+"\tПроизведение цифр числа: "+((num/10)*(num%10)));
		}
	}
}
