import java.util.*;
class Task_15_18 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x;
	System.out.print("Введите число: ");
	x = in.nextInt();
	
	while (x > 0) {	
		x = x/10;
		System.out.println("x = "+x);
	}
	}
}
