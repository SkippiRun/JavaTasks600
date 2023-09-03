import java.util.*;
class Task_12_3 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, count=0, x1=1;
	for (int i = 1; i <= 12; i++) {
		System.out.print("Введите число: ");
		x = in.nextInt();
		if (i == 1) x1 = x;
		if (x >= x1) count++;
	}
	System.out.println("Количество чисел, больших "+x1+" равно "+count);
	}
}
