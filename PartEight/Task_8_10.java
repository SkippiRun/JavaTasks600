import java.util.*;
class Task_8_10 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print("Введите первое число a = ");
	a = reader.nextInt();
	if (a < 0) System.out.println("a*a = " + (a*a));
	else System.out.println("a >= 0");
}
}
