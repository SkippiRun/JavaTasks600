//import java.util.*;
public class Task_10_11 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, sum, up = 11, down = 3;
//	System.out.println("Введите положительное число ");
//	avg = in.nextInt();
	a = down + (int)((up-down+1)*Math.random());
	b = down + (int)((up-down+1)*Math.random());
	c = down + (int)((up-down+1)*Math.random());
	sum = a+b+c;
	System.out.println("a\tb\tc\tsum");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+sum);
	if (sum == 21) System.out.println("Очко");
	else if (sum > 21) System.out.println("> 21");
	else if (sum < 21) System.out.println("< 21");
}
}
