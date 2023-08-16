import java.util.*;
class Task_8_29 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	double a, b, c, d;
	System.out.print ("Введите число 11: ");
	a = reader.nextDouble();
	System.out.print ("Введите число 12: ");
	b = reader.nextDouble();
	System.out.print ("Введите число 21: ");
	c = reader.nextDouble();
	System.out.print ("Введите число 22: ");
	d = reader.nextDouble();
	if (b == 0 | d ==0) System.out.println("Знаменатель не может быть нулем!");
	else {
		if (a/b == c/d) System.out.println("Дроби равны\t"+(a/b)+"=="+(c/d));
		else if  (a/b > c/d) System.out.println("Дробь 1 больше\t"+(a/b)+">"+(c/d));
		else System.out.println("Дробь 2 больше\t"+(a/b)+"<"+(c/d));
	}
}
}
