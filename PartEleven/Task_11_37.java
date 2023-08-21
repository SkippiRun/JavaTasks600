import java.util.*;
class Task_11_37 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, down = -18, up = 18;

//		System.out.print("Введите цифру: ");
//		num = in.nextInt();
		System.out.println("Start");
//		if (num > 0) num = -num;
		for (i = 0; i <= 20; i++) {
		num = down + (int)((up-down+1)*Math.random());
		if (num < 0) System.out.println("num = "+num+"   \tnum^2 = "+Math.pow(num,2));
		else if (num > 0) System.out.println("num = "+num+"   \tnum^1/2 = "+Math.round(Math.sqrt(num)));
		else System.out.println("Zero");
		}
		System.out.println("Stop");
	}
}
