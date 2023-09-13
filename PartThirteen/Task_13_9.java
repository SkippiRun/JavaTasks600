import java.util.*;
class Task_13_9 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, y, x1=0, y1=0, sum = 0;
	System.out.println("Введите первое число: ");
	x = in.nextInt();
	System.out.println("Введите второе число: ");
	y = in.nextInt();
	for (int i = 1; i <= x; i++){
		for (int j = 1; j <= y; j++){
			if (x%i == 0) x1 = x;
			if (y%j == 0) y1 = y;
			if (x1 == y1) {
				sum = x1 + y1;
				System.out.println("x = "+x+"\ty = "+y+"\nx1 = "+x1+"\ty1 = "+y1);
				System.out.println("i = "+i+"\tj = "+j+"sum = "+sum);
			}
		}
	}
	if ((sum%2 == 0) && sum != 0) System.out.println("Введенные числа "+x+" и "+y+" являются четно-близкими по сумме");
	else  System.out.println("Введенные числа "+x+" и "+y+" не являются четно-близкими по сумме");
	}
}
