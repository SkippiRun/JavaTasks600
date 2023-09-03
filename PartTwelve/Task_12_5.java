//import java.util.*;
class Task_12_5 {
	//public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, down = -25, up = 25, countPositive = 0, countEven = 0, countSingle = 0;
	for (int i = 1; i <= 17; i++) {
		//System.out.print("Введите число: ");
		//x = in.nextInt();
		x = down + (int)((up-down+1)*Math.random());
		System.out.println("Число: "+x);
		if (x > 0) countPositive++;
		if (x%2 == 0) countEven++;
		if (x/10 == 0) countSingle++;
		}
	System.out.println("Число положительных чисел: "+countPositive);
	System.out.println("Число четных чисел: "+countEven);
	System.out.println("Число однозначных чисел: "+countSingle);
	}
}
