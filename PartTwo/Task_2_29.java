import java.util.Scanner;
class Task_2_29{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b;
		System.out.print("Введите время в часах :");
		a = reader.nextInt();
		System.out.println("Вы ввели "+ a + "ч.");
		System.out.println("Время в минутах "+ (a*60) + "м.");
		System.out.println("Время в секундах "+ (a*60*60) + "с.");
	}
}
