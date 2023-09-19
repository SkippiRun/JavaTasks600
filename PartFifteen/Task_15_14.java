import java.util.*;
class Task_15_14 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, sum = 0, count = 0;
	System.out.print("Введите число: ");
	x = in.nextInt();
	
	while (x > 0) {	
		sum += x%10;
		count++;
		x = x/10;
		System.out.println("x = "+x+"\tsum = "+sum+"\tcount = "+count);
	}
		System.out.println("\nx = "+x+"\tsum = "+sum+"\tcount = "+count);
	}
}
