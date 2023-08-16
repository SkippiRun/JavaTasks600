import java.util.*;
class Task_8_32 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, c;
	double b;
	System.out.print ("Введите трехзначное число: ");
	a = reader.nextInt();
	if (a%2 == 0) {
		System.out.print ("Введите дробное число: ");
		b = reader.nextDouble();
		System.out.println(a+"*"+b+" = " + (a*b));
	}
	else {
		System.out.print ("Введите целое число: ");
		c = reader.nextInt();
		System.out.println(a+"+"+c+" = " + (a+c));
	}
}
}
