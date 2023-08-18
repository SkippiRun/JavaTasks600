import java.util.*;
public class Task_10_12 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int enter, a, b, c, d, sum, up = 11, down = 3;

	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());
	c = down + (int)((up-down+1)*Math.random());
	sum = a+b+c;
	System.out.println("a\tb\tc\tsum");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+sum);

	System.out.println("Введите 1, если хотите добавит 4 карту. Если нет - введите 2 ");
	enter = in.nextInt();
	if (enter == 1) {
		d = down + (int)((up-down+1)*Math.random());
		sum+=d;
	System.out.println("a\tb\tc\td\tsum");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+sum);
	}

	if (sum == 21) System.out.println("Очко");
	else if (sum > 21) System.out.println("> 21");
	else if (sum < 21) System.out.println("< 21");
}
}
