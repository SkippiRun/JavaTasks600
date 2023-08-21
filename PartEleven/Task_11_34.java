import java.util.*;
class Task_11_34 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, j=0, down = 100, up = 999;

		System.out.print("Введите цифру: ");
		num = in.nextInt();
		System.out.println("Start");
		if (num < 0) num = -num;
		for (i = num+1; i <= num+18; i++) {
		//if (i%11 == 0) System.out.println("i = "+i);
		System.out.println("i = "+i);
		j++;
		}
		System.out.println("Stop\n"+j);
	}
}
