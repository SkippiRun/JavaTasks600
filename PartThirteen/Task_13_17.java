import java.util.*;
class Task_13_17 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, x0, x1, x2 = 0, sum = 0;
	System.out.println("Введите число членов последовательности: ");
	x = in.nextInt();
	x0 = 1;
	x1 = 1;
	for (int i = 3; i <= x; i++) {
		x2 = x1+x0;
		System.out.println("x0 "+x0+"\tx1 "+x1+"\tx2 "+x2);
		x0 = x1;
		x1 = x2;
		System.out.println("x0 "+x0+"\tx1 "+x1+"\tx2 "+x2);
	}
	System.out.println("Сумма равна "+x2);
	}
}
