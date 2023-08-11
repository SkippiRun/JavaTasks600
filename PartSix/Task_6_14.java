import java.util.*;
class Task_6_14 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	double x, y;
	System.out.print("Введите числитель (x) ");
	x = in.nextInt();
	System.out.print("Введите знаменатель (y) ");
	y = in.nextInt();

	if (y<0) {
		System.out.println("Ошибка! \nНа 0 нельзя делить!");
}

	else if ((x/y) > 0) System.out.println("Дробь положительная.\tx/y = " + x/y);
	else if ((x/y) < 0) System.out.println("Дробь отрицательная.\tx/y = " + x/y);
}
}
