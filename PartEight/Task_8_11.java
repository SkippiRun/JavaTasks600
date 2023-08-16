import java.util.*;
class Task_8_11 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b;
	System.out.print ("Введите количество учеников в классе = ");
	a = reader.nextInt();
	System.out.print ("Введите количество стульев = ");
	b = reader.nextInt();
	if (a > b) System.out.println ("Не хватает " + (a-b) + " стульев");
	else if (a < b) System.out.println ("Излишек в " + (b-a) + " стульев");
	else System.out.println ("Рррровно день в день...\nРррровно часы в часы...");
}
}
