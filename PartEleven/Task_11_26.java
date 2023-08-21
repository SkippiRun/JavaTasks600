import java.util.*;
class Task_11_26 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, j=0, sum=0;
		System.out.print("Введите число: ");
		num = in.nextInt();
		System.out.println("Start");
		if (num > 0) num = -num;
		for (i = num+1; i <= -num-1; i++) {
		System.out.print(i+" ");
		j++;
		sum+=i;
		}
		System.out.println("\nStop\nКоличество итераций "+j+"\nОбщая сумма "+ sum);
	}
}
