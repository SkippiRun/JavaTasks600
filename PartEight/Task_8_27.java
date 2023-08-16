import java.util.*;
class Task_8_27 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, e, f;
	System.out.print ("Введите первое число: ");
	a = reader.nextInt();
	System.out.print ("Введите второе число: ");
	b = reader.nextInt();
	if (a%10 > b%10) {
		 System.out.println ("Последняя цифра числа "+a+" больше последней цифры числа "+b);
	}
	else if (a%10 < b%10) {
		 System.out.println ("Последняя цифра числа "+a+" меньше последней цифры числа "+b);
	}
	else System.out.println ("Последняя цифра числа "+a+" равна последней цифры числа "+b);
}
}
