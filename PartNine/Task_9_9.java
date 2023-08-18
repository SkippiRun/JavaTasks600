import java.util.*;
class Task_9_9 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	double a, b;
	System.out.println("Введите коэффициент a:");
	a = in.nextDouble();
	System.out.println("Введите коэффициент b:");
	b = in.nextDouble();

	if (a==0 && b == 0) System.out.println("Бесконечное множество решений");
	else if (a == 0 && b !=0) System.out.println("Решений нет!");
	else if (a != 0) System.out.println("Корень уравнения равен " + (-b/a));
}
}
