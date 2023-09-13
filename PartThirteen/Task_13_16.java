import java.util.*;
class Task_13_16 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	double x, a, sum = 0.0;
	System.out.println("Введите число членов последовательности: ");
	x = in.nextDouble();
	for (int i = 1; i <= x; i++) {
		a = Math.pow((2*i-1), 0.5);
		sum += a;
	}
	System.out.println("Сумма равна "+sum);
	}
}
