//import java.util.*;
public class Task_10_16 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, a1, a2, b1, b2, up = 94, down = 17;

	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());

	System.out.println("a\tb");
	System.out.println(a+"\t"+b);

	if (a>b) System.out.println("Большее число - "+a);
	else System.out.println("Большее число - "+b);

	a1 = a/10;
	a2 = a%10;
	b1 = b/10;
	b2 = b%10;

	if (a1<=a2 && a1<=b1 && a1<=b2) System.out.println("Наименьшая цифра " + a1);
	else if (a2<=a1 && a2<=b1 && a2<=b2) System.out.println("Наименьшая цифра " + a2);
	else if (b1<=a1 && b1<=a2 && b1<=b2) System.out.println("Наименьшая цифра " + b1);
	else if (b2<=a1 && b2<=b2 && b2<=b1) System.out.println("Наименьшая цифра " + b1);
}
}
