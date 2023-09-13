import java.util.*;
class Task_13_5 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, sum = 0;//, count = 0;//, down = 10, up = 99;
	System.out.println("Введите число: ");
	x = in.nextInt();
	for (int i = x; i >= 1; i--){
		sum+=i;
	}
	System.out.println("sum = "+sum);
	}
}
