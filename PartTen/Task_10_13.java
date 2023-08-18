//import java.util.*;
public class Task_10_13 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int enter, a, b, c, d, sum, up = 6, down = 1;

	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());
	System.out.println("a\tb");
	System.out.println(a+"\t"+b);

	if (a == b) System.out.println("Ничья");
	else if (a > b) System.out.println("Игрок a победил");
	else if (a < b) System.out.println("Игрок b победил");
}
}
