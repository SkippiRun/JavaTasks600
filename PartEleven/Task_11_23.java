import java.util.*;
class Task_11_23 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int num, i, j=0, sum=0;
		System.out.print("Введите число членов арифметической прогрессии: ");
		num = in.nextInt();
		System.out.println("Start");
		for (i = 7; i <= num*7; i+=4) {
		System.out.print(i+" ");
		j++;
		sum+=i;
		}
		System.out.println("\nStop\nКоличество итераций "+j+"\nОбщая сумма "+ sum);
	}
}
