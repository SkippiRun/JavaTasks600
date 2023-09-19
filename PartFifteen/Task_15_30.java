import java.util.*;
class Task_15_30 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, count = 0;
	System.out.print("Введите число: ");
	x = in.nextInt();
	while (x > 0) {
		if (x%10 == 0) count++;
		x /= 10;
		System.out.println("x = "+x+"\tcount = "+count);
	}
		System.out.println("\n\nx = "+x+"\tcount = "+count);
	}
}
