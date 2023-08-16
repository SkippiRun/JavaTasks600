import java.util.*;
class Task_8_23 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d;
	System.out.print ("Введите первое число ");
	a = reader.nextInt();
	System.out.print ("Введите второе число ");
	b = reader.nextInt();

	if (a == b) {
	c = a + 1;
	d = b + 1;
	}
	else {
	c = a - 1;
	d = b - 1;
	}
	System.out.println("Первое число, ввод "+ a + "\tвывод " + c + "\nВторое число, ввод "+ b + "\tвывод " + d);
}
}
