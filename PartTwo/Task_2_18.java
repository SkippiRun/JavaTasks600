import java.util.Scanner;
class Task_2_18{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a;
		System.out.print("Введите число :");
		a = reader.nextInt();
		System.out.println("a^2 = "+ (a*a) + "\ta^3 = " + (a*a*a));
	}
}
