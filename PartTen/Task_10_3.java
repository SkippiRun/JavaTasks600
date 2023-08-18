public class Task_10_3 {

	public static void main (String[] args){
	int a, b, up1 = 9, up2 = 1, down1 = -1, down2= -9;
	a = down2 + (int)((up1-down2+1)*Math.random());
	b = down2 + (int)((up1-down2+1)*Math.random());
	System.out.println(">\t<");
	if (a>b) System.out.println(a+"\t"+b);
	else if (a<b) System.out.println(b+"\t"+a);
	else System.out.println(a+"\t"+b+"\tЧисла равны");
}
}
