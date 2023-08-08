import java.util.Scanner;
class Task_2_33{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b, c;
		System.out.print("Введите длину верхнего основания: ");
		a = reader.nextInt();
		System.out.print("Введите длину нижнего основания: ");
		b = reader.nextInt();
		System.out.print("Введите высоту: ");
		c = reader.nextInt();
		System.out.println("a = "+ a + "\tb = " + b + "\tc = " + c);
		System.out.println("Объем трапеции равен: " + (0.5*c*(a+b)));
	}
}
