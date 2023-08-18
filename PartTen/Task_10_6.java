//import java.util.*;
public class Task_10_6 {
	//public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d, up1 = 99, up2 = 10;
	//up1 = in.nextInt();
	a = up2 + (int)((up1-up2+1)*Math.random());
	b = a + (int)((up1-a+1)*Math.random());
	c = a + (int)((up1-a+1)*Math.random());
	d = a + (int)((up1-a+1)*Math.random());
	System.out.println("IN\tOUT1\tOUT2\tOUT3");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}
