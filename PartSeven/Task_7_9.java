import java.util.*;
class Task_7_9 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите катет 1 ");
	double a = in.nextDouble();

	System.out.print("Введите катет 2 ");
	double b = in.nextDouble();

	System.out.print("Введите гипотенузу ");
	int с = in.nextInt();

	if ( ((int)Math.sqrt(a*a+b*b)) == с) System.out.println("Прямоугольный треугольник может жить!");
	else System.out.println("Такого треугольника не может быть!");
}
}
