import java.util.*;
class Task_4_19 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y = 0;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		y = ((x%10)*10+((x%100)/10)*100);
		System.out.println("Результат равен " + y);
	}
}
