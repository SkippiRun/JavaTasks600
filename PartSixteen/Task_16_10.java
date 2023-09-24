import java.util.*;
class Task_16_10 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
		//System.out.print("Введите число: ");
		//int n = in.nextInt();
		for (int i = 1; i <= 10000; i++){
			int sum = 1;
			for (int j = 1; j <= i/2; j++){
				if (i%j == 0) sum += j;
			}
		if (sum == i) System.out.println("Число "+i+" полноценное, тк сумма его делителей равна "+sum);
		//System.out.println();
		}
	}
}
