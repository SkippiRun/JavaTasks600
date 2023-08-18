import java.util.*;
public class Task_10_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, up1, up2 = 1;
	up1 = in.nextInt();
	a = up2 + (int)((up1-up2)*Math.random());
	b = up2 + (int)((up1-up2)*Math.random());
	c = up2 + (int)((up1-up2)*Math.random());
	System.out.println("IN\tOUT1\tOUT2\tOUT3");
	System.out.println(up1+"\t"+a+"\t"+b+"\t"+c);
}
}
