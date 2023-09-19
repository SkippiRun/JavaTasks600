import java.util.*;
class Task_15_25 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, lastNum = 0;// down = 11111, up = 9999999;
	System.out.println("Введите число: ");
	a = in.nextInt();
	//a = down + (int)((up - down + 1)*Math.random());
	System.out.println("a = "+a);
	while(a > 0){
		lastNum = a;
		a /= 10;
	}
	System.out.println("lastNum = "+lastNum);
	}
}
