//import java.util.*;
public class Task_10_15 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, up = 746, down = 250;

	a = down + (int)((up-down+1)*Math.random());
	b = a/100;
	c = a%100/10;
	d = a%10;

	System.out.println("a\tb\tc\td");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	if (b>=c && b>=d) System.out.println("Наибольшее число " + b);
	else if (c>=b && c>=d) System.out.println("Наибольшее число " + c);
	else if (d>=c && d>=b) System.out.println("Наибольшее число " + d);

	if (b<=c && b<=d) System.out.println("Наименьшее число " + b);
	else if (c<=b && c<=d) System.out.println("Наименьшее число " + c);
	else if (d<=c && d<=b) System.out.println("Наименьшее число " + d);

	if (b == c || b == d || c == d) System.out.println("В "+a+" есть одинаковые цифры");
	else System.out.println("Одинаковых цифр в "+a+" нет");
}
}
