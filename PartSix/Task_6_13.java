import java.util.*;
class Task_6_13 {
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

	else System.out.println("x/y = " + x/y);

}
}
