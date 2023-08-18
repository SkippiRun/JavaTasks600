//import java.util.*;
public class Task_10_14 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, e, up = 9, down = 1;

	a = 10*(down + (int)((up-down+1)*Math.random()));
	b = 10*(down + (int)((up-down+1)*Math.random()));
	c = 10*(down + (int)((up-down+1)*Math.random()));
	d = 10*(down + (int)((up-down+1)*Math.random()));
	e = 10*(down + (int)((up-down+1)*Math.random()));

	System.out.println("a\tb\tc\td\te");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);

}
}
