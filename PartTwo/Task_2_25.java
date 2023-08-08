import java.util.Scanner;
class Task_2_25{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b, c;
		System.out.print("Введите первое число :");
		a = reader.nextInt();
		System.out.print("Введите второе число :");
		b = reader.nextInt();
		System.out.print("Введите третье число :");
		c = reader.nextInt();
		System.out.println("a = "+ a + "\tb = " + b + "\tc = " + c);
		System.out.println("Объем параллелепипеда равен: " + (a*b*c));
		System.out.println("Площадь стороны 1: " + (a*b));
		System.out.println("Площадь стороны 2: " + (a*c));
		System.out.println("Площадь стороны 2: " + (c*b));
		System.out.println("Общая площадь сторон: " + ((a*b)+(a*c)+(b*c)));
		System.out.println("Общий периметр: " + ((a+b)*2+(a+c)*2+(b+c)*2));
	}
}
