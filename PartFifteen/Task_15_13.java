import java.util.*;
class Task_15_13 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, count = 0;
	System.out.print("Введите первое число: ");
	x = in.nextInt();
	System.out.print("Введите второе число: ");
	y = in.nextInt();
	System.out.println("x = "+x+"\ty = "+y);
	
	while (y > x) {	
		count++;
		x = y;
		System.out.print("Введите следующее число: ");
		y = in.nextInt();
		System.out.println("x = "+x+"\ty = "+y+"\tcount = "+count);
	}
		System.out.println("\nx = "+x+"\ty = "+y+"\tcount = "+count);
	}
}
