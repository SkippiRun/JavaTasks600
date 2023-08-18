import java.util.*;
public class Task_10_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, avg;
	System.out.println("Введите положительное число ");
	avg = in.nextInt();
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
