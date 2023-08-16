import java.util.*;
class Task_8_6 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, x;
	System.out.print("Введите первое число = ");
	a = reader.nextInt();

	System.out.print("Введите второе число = ");
	b = reader.nextInt();

	if (a/2 != b) x = a/2 + b;
	else x = b/2 + a;

	if (x < 15) System.out.println("X = " + x);
	else System.out.println(x);

}
}
