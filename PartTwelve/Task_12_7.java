import java.util.*;
class Task_12_7 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y, countEquall = 0, countLess = 0, countMore = 0;
	System.out.print("Введите первое число: ");
	x = in.nextInt();
	for (int i = 1; i <= 5; i++) {
		System.out.print("Введите "+i+" число: ");
		y = in.nextInt();
		if (x == y) countEquall++;
		if (x < y) countLess++;
		if (x > y) countMore++;
		}
	System.out.println("Количество равных чисел: "+countEquall);
	System.out.println("Количество меньших чисел: "+countLess);
	System.out.println("Количество больших чисел: "+countMore);
	}
}
