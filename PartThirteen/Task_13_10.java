import java.util.*;
class Task_13_10 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, y, x1 = 0, y1 = 0, sum = 0;
	System.out.println("Введите первое число: ");
	x = in.nextInt();
	System.out.println("Введите второе число: ");
	y = in.nextInt();
	for (int i = 2; i <= x; i++){
		for (int j = 2; j <= y; j++){
			if (x%i == 0) x1 = i;
			if (y%j == 0) y1 = j;
			System.out.println("x1 = "+x1+"\ty1 = "+y1);
			System.out.println("i = "+i+"\tj = "+j);
			if (x1 == y1 && i == j) {
				//sum = i + j;
				System.out.println("Делители: i = "+i+"\tj = "+j);
				//System.out.println("x = "+x+"\ty = "+y+"\nx1 = "+x1+"\ty1 = "+y1);
				//System.out.println("Общий делитель i = "+i+"\tj = "+j+"\tsum = "+sum);
			}
		}
	}
	System.out.println("Степень близости введенных чисел равна "+sum);
	}
}
