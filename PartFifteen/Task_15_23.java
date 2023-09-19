import java.util.*;
class Task_15_23 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, x , y, down = 11111, up = 9999999;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	a = down + (int)((up - down + 1)*Math.random());
	x = a;
	y = a;
	System.out.println("a = "+a);
	while(x > 0){
		if (x%2 == 0) System.out.print(" "+(x%10));
		x /= 10;
	}
	System.out.println("\n");
	while (y > 0){
		if (y%2 != 0) System.out.print(" "+(y%10));
		y /= 10;
	}
	System.out.println("\n");
	}
}
