//import java.util.*;
public class Task_10_7 {
	//public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, e, up1 = 99, up2 = 10;
	//up1 = in.nextInt();
	a = up2 + (int)((up1-up2+1)*Math.random());
	b = up2 + (int)((a-up2)*Math.random());
	c = b + (int)((a-b)*Math.random());
	d = b + (int)((a-b)*Math.random());
	e = b + (int)((a-b)*Math.random());
	System.out.println("IN1\tIN2\tOUT1\tOUT2\tOUT3");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
}
}
