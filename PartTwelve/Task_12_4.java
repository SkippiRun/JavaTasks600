import java.util.*;
class Task_12_4 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, x1=0;
	for (int i = 1; i <= 17; i++) {
		System.out.print("Введите число: ");
		x = in.nextInt();
		if (i == 1) System.out.println("Вы ввели первое число");
		else if (x1 > x) System.out.println("Предыдущее число больше нынешнего");
		else if (x1 < x) System.out.println("Предыдущее число меньше нынешнего");
		else if (x1 == x) System.out.println("Предыдущее число равно нынешнему");
		x1 = x;
		}
	}
}
