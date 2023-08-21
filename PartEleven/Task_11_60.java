import java.util.*;
class Task_11_60 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, i;
		System.out.print("Введите первое число: ");
		inpt1 = in.nextInt();
		if (inpt1 < 0) inpt1 = -inpt1;
		System.out.println("Start");
		for (i = 1; i <= inpt1; i++) System.out.println(i + "\t" + (i*i));
		System.out.println("Stop");
	}
}
