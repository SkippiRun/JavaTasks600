import java.util.*;
class Task_4_16 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		y = ((x/1000)+((x%1000)/100)*10+((x%100)/10)*100+(x%10)*1000);
		System.out.println("Результат равен " + y);
	}
}
