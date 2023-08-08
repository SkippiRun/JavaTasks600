import java.util.Scanner;
class Task_2_22{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b;
		System.out.print("Введите первое число :");
		a = reader.nextInt();
		System.out.print("Введите второе число :");
		b = reader.nextInt();
		System.out.println("a = "+ a + "\tb = " + b);
		System.out.println("a+b = "+ (a+b) + "\na*b = " + (a*b));
		System.out.println("a-b = "+ (a-b) + "\nb-a = " + (b-a));
	}
}
