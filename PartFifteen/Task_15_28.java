import java.util.*;
class Task_15_28 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, b, x, count = 0;// down = 1, up = 9;
	System.out.println("Введите число: ");
	a = in.nextInt();
	b = a;
	//x = down + (int)((up - down + 1)*Math.random());
	while(a > 0){
			count++;
			a /= 10;
	}
	System.out.println("Количество цифрв в числе "+b+" равно "+count);
	}
}
