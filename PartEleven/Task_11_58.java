import java.util.*;
class Task_11_58 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, inpt2, sum=0, i;
		System.out.print("Введите первое число: ");
		inpt1 = in.nextInt();
		if (inpt1 < 0) {
		inpt1 = -inpt1;
		}
		System.out.println("Start");
		for (i = 1; i <= inpt1; i++) {
		System.out.print("Введите число: ");
		inpt2 = in.nextInt();
		if (inpt2 < 0) System.out.println("Число отрицательное. Ничего не делаем");
		else {
		sum+=inpt2;
		System.out.println("inpt2 = "+inpt2);
		}
		}
		System.out.println("Stop"+"\nSum="+sum);
	}
}
