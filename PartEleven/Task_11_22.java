import java.util.*;
class Task_11_22 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, j=0, down = 0, up = 9;
		System.out.println("Введите число");
		num = in.nextInt();
		System.out.println("Start");
		for (i = num-10; i >=((num-10)-6*16); i-=6) {
		System.out.print(i+" ");
		j++;
		}
		System.out.println("\nStop\n"+j);
	}
}
