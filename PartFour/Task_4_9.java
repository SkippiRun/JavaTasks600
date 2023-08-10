import java.util.*;
class Task_4_9 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x;
		System.out.println("Введите двузначное число ");
		x=in.nextInt();
		System.out.println("Сумма цифр вашего числа равна " + ((x/10)+(x%10)));
	}
}
