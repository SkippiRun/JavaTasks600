import java.util.*;
class Task_9_10 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int num1, num2, num3;
	System.out.println("Введите 1 число");
	num1 = in.nextInt();
	System.out.println("Введите 2 число");
	num2 = in.nextInt();
	System.out.println("Введите 3 число");
	num3 = in.nextInt();
	if (num1 > num2) System.out.println("Число " + num1 + " больше числа " + num2);
	else System.out.println("Число " + num1 + " меньше числа " + num2);
	if (num1 > num3) System.out.println("Число " + num1 + " больше числа " + num3);
	else System.out.println("Число " + num1 + " меньше числа " + num3);
	if (num3 > num2) System.out.println("Число " + num3 + " больше числа " + num2);
	else System.out.println("Число " + num3 + " меньше числа " + num2);
	}
}
