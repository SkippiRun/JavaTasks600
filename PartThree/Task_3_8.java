import java.util.*;
class Task_3_8{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double a, b, h;
		System.out.print("Введите основание ");
		a = in.nextDouble();
		System.out.print("Введите высоту ");
		h = in.nextDouble();
		b = Math.sqrt(h*h+((a/2)*(a/2)));
		System.out.println("Длина боковых граней " + b);
		System.out.println("Площадь равна " + (0.5*a*h));
		System.out.println("Периметр равен " + (a+2*b));
	}
}
