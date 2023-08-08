import java.util.*;
class Task_3_1{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double F, C;
		System.out.println("Введите температуру по Фаренгейту ");
		F = in.nextInt();
		System.out.println("Температура по Цельсия " + (5*(F-32)/9));
	}
}
