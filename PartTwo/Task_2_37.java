import java.util.Scanner;
class Task_2_37{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		String name1, name2;
		System.out.print("Введите ваше имя: ");
		name1 = reader.next();
		System.out.print("Введите вашу фамилию: ");
		name2 = reader.next();
		System.out.println("Пассажир " + name1 + " "  + name2 + " опоздал");
		System.out.println("Пассажир " + name2 + " "  + name1 + " опоздал");
	}
}
