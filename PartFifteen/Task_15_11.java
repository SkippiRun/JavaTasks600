import java.util.*;
class Task_15_11 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, sum = 0, count = 0, down = 0, up = 10;
	System.out.println("Введите первое число: ");
	x = in.nextInt();
	System.out.println("Введите второе число: ");
	y = in.nextInt();
	System.out.println("x = "+x+"\ty = "+y+"\n\n");

	while (x != y) {
		System.out.println("Введите первое число: ");
		x = in.nextInt();
		System.out.println("Введите второе число: ");
		y = in.nextInt();
		System.out.println("x = "+x+"\ty = "+y);
	}
	System.out.println("\n\nx = "+x+"\ty = "+y);
	}
}
