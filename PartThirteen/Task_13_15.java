import java.util.*;
class Task_13_15 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, x1, x2, sum = 0;
	System.out.println("Введите двузначное положительное число: ");
	x = in.nextInt();
	x1 = x%10;
	x2 = x/10;
	if (x1 > x2) for (; x2 <= x1; x2++) sum+= x2;
	else if (x1 < x2) for (; x2 >= x1; x2--) sum+= x2;
	System.out.println("Сумма равна "+sum);
	}
}
