import java.util.Scanner;
class Task_2_32{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		double a, b;
		System.out.print("Введите число ");
		a = reader.nextInt();
		System.out.println("Вы ввели "+ a + "\tОбратное число " + -a);
	}
}
