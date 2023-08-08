import java.util.*;
class Task_3_10{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double a, b, c;
		System.out.print("Введите количество заработанных Васей денег ");
		a = in.nextDouble();
		System.out.print("Введите количество денег, что дали родители Васи ");
		b = in.nextDouble();
		System.out.print("Введите курс евро по отношению к рублю ");
		c = in.nextDouble();
		System.out.println("Количество денег в рублях " + (a+b));
		System.out.println("Количество денег в евро " + ((a+b)/c));
	}
}
