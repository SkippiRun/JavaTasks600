import java.util.*;
class Task_4_18 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y = 0;
		System.out.println("Введите четырехзначное число ");
		x=in.nextInt();
		y = ((x%10)*10+((x%100)/10)*100+((x%1000)/100)*1000);
		System.out.println("Результат равен " + y);
	}
}
