import java.util.*;
class Task_6_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	System.out.print("Введите свой возраст ");
	int age = in.nextInt();
	if (age > 18) System.out.println("Плоти НОЛОГИ");
	if (age == 18) System.out.println("Кто ты по жизни?");
	if (age < 18) System.out.println("Соси ПИПОС");
}
}
