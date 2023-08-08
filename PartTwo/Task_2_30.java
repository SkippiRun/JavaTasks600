import java.util.Scanner;
class Task_2_30{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b;
		System.out.print("Введите текущее время\nВведите текущие часы: ");
		a = reader.nextInt();
		System.out.print("Введите текущие минуты: ");
		b = reader.nextInt();
		System.out.println("Ваше текущее время в формате чч.мм "+ a + "ч. " + b + "м.");
		System.out.println("С полуночи  прошло "+ a + "ч. " + b + "м.");
		System.out.println("До полуночи  осталось "+ (24-a) + "ч. " + (60-b) + "м.");
	}
}
