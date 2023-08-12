import java.util.*;
class Task_7_7 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите количество ученников ");
	int a = in.nextInt();

	System.out.print("Введите количество стульев ");
	int b = in.nextInt();

	if (a == b) System.out.println("Стульев хватит всем! Ни больше, ни меньше!");
	else if (a > b)System.out.println("Стульев не хватит " + (a-b) + " ученникам");
	else if (a < b)System.out.println("Имеется " + (b-a) +" свободных стульев");
}
}
