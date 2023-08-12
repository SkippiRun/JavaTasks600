import java.util.*;
class Task_7_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите количество ученников ");
	int a = in.nextInt();

	System.out.print("Введите количество столов ");
	int b = in.nextInt();

	if (a == b*2) System.out.println("Столов хватит всем! Ни больше, ни меньше!");
	else if (a > b*2)System.out.println("Столов не хватит для "+(a-b*2)+" ученников");
	else if (a < b*2)System.out.println("Имеется "+(b*2-a)+" свободных мест");
}
}
