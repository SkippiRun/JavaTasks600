import java.util.*;
class Task_9_6 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	System.out.println("Введите 1 сторону треугольника");
	int a;
	a = in.nextInt();
	System.out.println("Введите 2 сторону треугольника");
	int b;
	b = in.nextInt();
	System.out.println("Введите 3 сторону треугольника");
	int c;
	c = in.nextInt();
	if ((a+b)>c && (a+c)>b && (b+c)>a) System.out.println("Треугольник валидирован");
	else System.out.println("Трекгольник не валидирован");
}
}
