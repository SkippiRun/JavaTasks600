import java.util.*;
class Task_6_11 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	int x, y;
	System.out.print("Введите первое целое положительное число ");
	x = in.nextInt();
	System.out.print("Введите второе целое положительное число ");
	y = in.nextInt();

	if ((x*y)>0) System.out.println("Один и тот же знак");
	else if ((x*y)<0) System.out.println("Знак разный");
	else if ((x==0)|(y==0)) System.out.println("Некорректно");

}
}
