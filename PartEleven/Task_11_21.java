import java.util.*;
class Task_11_21 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, down = 0, up = 9;
/*		System.out.println("Введите первое число: ");
		down = in.nextInt();
		System.out.println("Введите второе число: ");
		up = in.nextInt();
		if (up < down) {
			up = down+up;
			down = up - down;
			up = up - down;
		}
*/
		System.out.println("Введите число");
		num = in.nextInt();
		System.out.println("Start");
		for (i = num+1; i <= num+17; i++) {
		System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
