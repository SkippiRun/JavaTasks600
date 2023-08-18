//import java.util.*;
public class Task_10_20 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, b1, b2, b3, max_b = 0, down1 = 1, up1 = 9, down2 = 100, up2 = 999;

	a = down1 + (int)((up1-down1+1)*Math.random());
	b = down2 + (int)((up2-down2+1)*Math.random());

	System.out.println("a\tb\n"+a+"\t"+b);
	b1 = b/100;
	b2 = b/10%10;
	b3 = b%10;
//	System.out.println(b1+" "+b2+" "+b3);

	if (b1>=b2 && b1>=b3) max_b = b1;
	else if (b2>=b1 && b2>=b3) max_b = b2;
	else if (b3>=b2 && b3>=b1) max_b = b3;

	System.out.println("Разница между первым числом и наибольшей цифрой второго числа составляет "+(a-max_b));
}
}
