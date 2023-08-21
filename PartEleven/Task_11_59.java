import java.util.*;
class Task_11_59 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt1, inpt2, sum=0, i;
		System.out.print("Введите первое число: ");
		inpt1 = in.nextInt();
		System.out.print("Введите второе число: ");
		inpt2 = in.nextInt();
		System.out.println("Start");
		if (inpt1 < inpt2) {
			for (i = inpt2; i <= (inpt1+inpt2); i++) System.out.println("First " + i);
		}
		else if (inpt1 >= inpt2) {
			for (i = inpt1; i <= (inpt1+inpt2); i++) System.out.println("Second " + i);
		}
//		else System.out.println("Первое число равно второму");
		System.out.println("Stop");
	}
}
