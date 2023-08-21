import java.util.*;
class Task_11_38 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, num, i, down = 100, up = 999;

		System.out.print("Введите цифру: ");
		inpt = in.nextInt();
		System.out.println("Start");
		if (inpt < 0) inpt =  inpt;
		for (i = 0; i <= 15; i++) {
		num = down + (int)((up-down+1)*Math.random());
		if (num%inpt == 0) System.out.println(Math.ceil(Math.sqrt(num/100)));
		else System.out.println(Math.floor(Math.sqrt((num%100)/10)));
		}
		System.out.println("Stop");
	}
}
