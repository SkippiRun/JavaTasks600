import java.util.Scanner;
class Task_2_23{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b;
		System.out.print("Введите первое число :");
		a = reader.nextInt();
		System.out.print("Введите второе число :");
		b = reader.nextInt();
		System.out.println("a = "+ a + "\tb = " + b);
		System.out.println("a^2 = "+ (a*a) + "\nb^2 = " + (b*b));
		System.out.println("a^2+b^2 = "+ (a*a+b*b));
	}
}
