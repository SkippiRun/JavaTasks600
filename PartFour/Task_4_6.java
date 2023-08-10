import java.util.*;
class Task_4_6 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		System.out.println("Ваши числа "+(x/100)*100+"+"+((x%100)/10)*10+"+"+(x%10));
	}
}
