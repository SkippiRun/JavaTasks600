import java.util.*;
class Task_8_30 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	double a, b, c;
	System.out.print ("Введите число 11: ");
	a = reader.nextDouble();
	System.out.print ("Введите число 12: ");
	b = reader.nextDouble();
	c = (int)(a/b);
	if (b == 0) System.out.println("Знаменатель не может быть нулем!");
	else {
		if (a/b < 1) System.out.println("Дробь "+(a/b)+" правильная");
		else if (a/b > 1) {
			System.out.println("Дробь "+(a/b)+" НЕправильная ->");
			System.out.println("Целая часть дроби равна "+c+" ->");
			System.out.println("Дробная часть дроби равна "+(a/b-a%b));
			System.out.println("Дробь равна "+(int)c+" целая и "+(int)(a-b*c)+"/"+(int)b);
		}
			else System.out.println("Дробь равна единице "+c);
	}
}
}
