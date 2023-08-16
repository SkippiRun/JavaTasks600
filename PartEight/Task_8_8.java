import java.util.*;
class Task_8_8 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c;
	System.out.print("Введите первое число = ");
	a = reader.nextInt();
	System.out.print("Введите второе число = ");
	b = reader.nextInt();

	c = a/2 + b/2;
	if (a+b != c) System.out.println("C = " + c);
	else {
		c = a%2 + b%2;
		System.out.println("C is " + c);
}
}
}
