import java.util.*;
class Task_4_12 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		System.out.println("Результат "+((x/100)-(x%10))*((x%100)/10));
	}
}
