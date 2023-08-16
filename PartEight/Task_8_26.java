import java.util.*;
class Task_8_26 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, e, f;
	System.out.print ("Введите число от 11 до 99999 : ");
	a = reader.nextInt();
	if (a<100){
		b = a%10;
		c = a/10;
		if (b == c) System.out.println ("Вы ввели полиндром " + a);
		else System.out.println ("Вы ввели не полиндром " + a);
	}
	else if (a<1000){
		b = a%10;
		c = a%100/10;
		d = a/100;
		if (b == d) System.out.println ("Вы ввели полиндром " + a);
		else System.out.println ("Вы ввели не полиндром " + a);
	}
	else if (a<10000){
		b = a%10;
		c = a%100/10;
		d = a%1000/100;
		e = a/1000;
		if (b == e && c == d) System.out.println ("Вы ввели полиндром " + a);
		else System.out.println ("Вы ввели не полиндром " + a);
	}
	else if (a<100000 & a>=10000){
		b = a%10;
		c = a%100/10;
		d = a%1000/100;
		e = a%10000/1000;
		f = a/10000;
		if (b == f && c == e) System.out.println ("Вы ввели полиндром " + a);
		else System.out.println ("Вы ввели не полиндром " + a);

	}
}
}
