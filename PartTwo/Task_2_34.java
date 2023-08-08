import java.util.Scanner;
class Task_2_34{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		String name1;
		System.out.print("Введите ваше имя: ");
		name1 = reader.next();
		System.out.println("Привет, "+ name1 + "!");
	}
}
