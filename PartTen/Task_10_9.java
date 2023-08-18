//import java.util.*;
public class Task_10_9 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, avg, up = 999, down = 1;
//	System.out.println("Введите положительное число ");
//	avg = in.nextInt();
	avg = down + (int)((up-down)*Math.random());
	b = avg - 5;
	c = avg + 5;
	a = b + (int)((c-b)*Math.random());
	System.out.println("IN\tOUT");
	System.out.println(avg+"\t"+a);
	if (avg == a) System.out.println(avg+"=="+a);
	else if (avg > a) System.out.println(avg+">"+a);
	else if (avg < a) System.out.println(avg+"<"+a);
}
}
