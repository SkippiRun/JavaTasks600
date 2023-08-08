import java.util.Scanner;
class Task_2_27{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		double a, b;
		System.out.print("Введите Вашу массу тела в граммах :");
		a = reader.nextInt();
		System.out.println("Ваш вес в граммах "+ a + "г.");
		System.out.println("Ваш вес в килограммах "+ (a/1000) + "кг.");
	}
}
