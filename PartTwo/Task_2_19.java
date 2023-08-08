import java.util.Scanner;
class Task_2_19{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		int a;
		System.out.print("Введите число :");
		a = reader.nextInt();
		System.out.println("a-1 = " + (a-1) + "\na = " + a + "\na+1 = " + (a+1));
	}
}
