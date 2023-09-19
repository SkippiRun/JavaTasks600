import java.util.*;
class Task_15_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, b;
	System.out.println("Введите числа: ");
	a = Math.abs(in.nextInt());
	b = Math.abs(in.nextInt());
	while (a > 0 || b > 0) {
		a /= 10;
		b /= 10;
		System.out.println("a = "+a+"\ta%10 = "+a%10+"\nb = "+b+"\tb%10 = "+b%10);	
	}
	}
}
