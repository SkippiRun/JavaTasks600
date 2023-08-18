//import java.util.*;
public class Task_10_18 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, max=0, min=0, down = 100, up = 999;

	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());
	c = down + (int)((up-down+1)*Math.random());

	System.out.println("a\tb\tc\n"+a+"\t"+b+"\t"+c);

	if (a>=b && a>=c) max = a;
	if (b>=a && b>=c) max = b;
	if (c>=b && c>=a) max = c;

	if (a<=b && a<=c) min = a;
	if (b<=a && b<=c) min = b;
	if (c<=b && c<=a) min = c;

	System.out.println("Разница между наибольшим и наименьшим значением составляет "+(max-min));
}
}
