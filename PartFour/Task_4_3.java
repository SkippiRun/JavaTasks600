import java.util.*;
class Task_4_3 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x;
		System.out.println("Введите двузначное число ");
		x=in.nextInt();
		System.out.println("Ваши числа " + (x%10)  + " " + (x/10));
	}
}
