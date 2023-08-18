//import java.util.*;
public class Task_10_19 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, e, count=0, down = -50, up = 50;

	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());
	c = down + (int)((up-down+1)*Math.random());
	d = down + (int)((up-down+1)*Math.random());
	e = down + (int)((up-down+1)*Math.random());

	System.out.println("a\tb\tc\td\te\n"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);


	if (a*b < 0) count++;
	if (c*b < 0) count++;
	if (c*d < 0) count++;
	if (d*e < 0) count++;

	System.out.println("Знак менялся "+count+" раз");
}
}
