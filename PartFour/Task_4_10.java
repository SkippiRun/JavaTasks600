import java.util.*;
class Task_4_10 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		System.out.println("Сумма цифр вашего числа равна "+((x/100)+((x%100)/10)+(x%10)));
	}
}
