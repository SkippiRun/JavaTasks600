import java.util.*;
class Task_16_9 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
		System.out.print("Введите число: ");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.print(i+"+");
			for (int j = 1; j <= i/2; j++){
				if (i%j == 0) System.out.print("+");
			}
		System.out.println();
		}
	}
}
