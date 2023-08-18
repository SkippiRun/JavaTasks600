import java.util.*;
class Task_9_19 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num1, num2;
	System.out.println("Введите длину 1 стороны ");
	num1 = in.nextInt();
	System.out.println("Введите длину 2 стороны ");
	num2 = in.nextInt();
	if (num1 == num2) System.out.println("Ваша фигура - Квадрат");
	else System.out.println("Ваша фигура - Прямоугольник");
}
}
