import java.util.*;
class Task_8_7 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b;
	System.out.print("Введите первое число = ");
	a = reader.nextInt();
	System.out.print("Введите второе число = ");
	b = reader.nextInt();
	if (a > b) System.out.println("Первое число больше второго. Результат равен = " + (a-b));
	else if (a < b) System.out.println("Второе число больше первого. Результат равен = " + (b-a));
	else System.out.println("Третий случай, числа равны. Результат равен = " + (a*b));

}
}
