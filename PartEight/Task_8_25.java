import java.util.*;
class Task_8_25 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	double a, a1, a2, b, c, d;
	System.out.print ("Введите трехзначное число ");
	a = reader.nextInt();
	if (a%2 == 0){
	System.out.print ("Введите дробное число ");
	a1 = reader.nextDouble();
	b = a*a1;
	System.out.println("Ввод1 "+a+"\tВвод2 "+a1+"\tВывод "+b);
	}
	else {
	System.out.print ("Введите целое число ");
	a2 = reader.nextInt();
	c = a*a2;
	System.out.println("Ввод1 "+a+"\tВвод2 "+a2+"\tВывод "+c);
	}
}
}
