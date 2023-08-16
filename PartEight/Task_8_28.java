import java.util.*;
class Task_8_28 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	double a, b, c;
	System.out.print ("Введите первое число: ");
	a = reader.nextDouble();
	System.out.print ("Введите второе число: ");
	b = reader.nextDouble();
	if (b == 0) System.out.println("Знаменатель не может быть нулем!");
	else {
		c = a/b;
		if (c > 1) System.out.println("Дробь НЕправильная " + c);
		else if (c < 1) System.out.println("Дробь правильная " + c);
		else System.out.println("Дробь равна единице " + c);
	}
}
}
