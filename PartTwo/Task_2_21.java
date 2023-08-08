import java.util.Scanner;
class Task_2_21{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a;
		System.out.print("Введите число :");
		a = reader.nextInt();
		System.out.print("a = "+ a + "\ta+1 = " + (a+1) + "\ta+2 = " + (a+2));
		System.out.println("\ta+3 = " + (a+3));
	}
}
