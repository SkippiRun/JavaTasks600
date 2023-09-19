import java.util.*;
class Task_15_17 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, count = 0;
	System.out.print("Введите число: ");
	x = in.nextInt();
	System.out.print("Введите цифру: ");
	y = in.nextInt();
	while (x > 0) {
		if (x%10 == y) {
			count++;
			System.out.println("Цифра "+y+" есть во введенном числе");
		}
		x /= 10;
		//System.out.println("x = "+x+"\ty = "+y+"\tcount = "+count);
	}
		//System.out.println("\nx = "+x+"\ty = "+y+"\tcount = "+count);
	}
}
