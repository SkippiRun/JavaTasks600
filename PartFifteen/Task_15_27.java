import java.util.*;
class Task_15_27 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, b, x, count = 0, down = 1, up = 9;
	System.out.println("Введите число: ");
	a = in.nextInt();
	b = a;
	x = down + (int)((up - down + 1)*Math.random());
	System.out.println("a = "+a+"\tx = "+x);
	while(a > 0){
		if ((a%10) == x){
		       	System.out.println("Цифра "+(a%10)+" есть в числе "+b);
			count++;
		}
			a /= 10;
	}
	if (count == 0) System.out.println("Цифры "+x+" нет в числе "+b);
	}
}
