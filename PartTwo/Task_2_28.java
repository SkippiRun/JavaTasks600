import java.util.Scanner;
class Task_2_28{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		double a, constKabeltsToMeters = 185.2;
		System.out.print("Введите расстояние в кабельтах :");
		a = reader.nextInt();
		System.out.println("Вы ввели "+ a);
		System.out.println("Ваше расстояние в метрах " + (a*constKabeltsToMeters));
		System.out.println("Ваше расстояние в километрах " + (a*constKabeltsToMeters/1000));
	}
}
