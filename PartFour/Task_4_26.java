import java.util.*;
class Task_4_26 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y, x1 = 0, y1 = 0;
		System.out.print("Введите первое трехзначное число ");
		x=in.nextInt();
		System.out.print("Введите второе трехзначное число ");
		y=in.nextInt();
		x1 = x - (x/100)*100+(y/100)*100;
		y1 = y - (y/100)*100+(x/100)*100;
		System.out.print("Обмен крайними правами цифрами произведен между числами ");
		System.out.println(x + " и " + y);
		System.out.println("Результат " + x1 + " и " + y1);
	}
}
