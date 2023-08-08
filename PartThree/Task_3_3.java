import java.util.*;
class Task_3_3{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double Sm, SmToInch = 1/(2.54);
		System.out.print("Введите размер в сантиметрах ");
		Sm = in.nextDouble();
		System.out.println("Размер в дюймах " + (Sm*SmToInch));
	}
}
