import java.util.Scanner;
class Task_2_26{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a, b;
		System.out.print("Введите год вашего рождения :");
		a = reader.nextInt();
		System.out.print("Введите текущий год :");
		b = reader.nextInt();
		System.out.print("Вы родились в "+ a + "\tТекущий год " + b +"\t");
		System.out.println("Ваш возраст - "+ (b-a) + " лет");
	}
}
