public class Task_10_1 {

	public static void main (String[] args){
	int a, b, c, d, e, up1 = 99, up2 = 10, down1 = -10, down2= -99;
	a = up2 + (int)((up1-up2+1)*Math.random());
//	b = up2 + (int)(up1*Math.random());
/*	b = down1 + (int)((down2-down1+1)*Math.random());
	c = b + (int)((a-b+1)*Math.random());
	e = down2 + (int)(up1*Math.random());
	d = down2 + (int)((up1 - down2+1)*Math.random());
*/	System.out.println(a/*+" "+b+"\n"+c+"\n"+e+"\n"+d*/);
}
}
