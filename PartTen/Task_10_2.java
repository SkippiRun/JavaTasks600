public class Task_10_2 {

	public static void main (String[] args){
	int a, b, up1 = 9, up2 = 1, down1 = -1, down2= -9;
	a = down2 + (int)((up1-down2+1)*Math.random());
	b = down2 + (int)((up1-down2+1)*Math.random());
	if (a>b) System.out.println("Первое число больше и равно " + a);
	else if (a<b) System.out.println("Второе число больше и равно "+b);
	else System.out.println("Числа равны " +a+"=="+b);
}
}
