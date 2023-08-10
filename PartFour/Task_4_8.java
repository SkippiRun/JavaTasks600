import java.util.*;
class Task_4_8 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y, z;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		y = (x%10)*100 + ((x%100)/10)*10 + (x/100);
		z = y-20;
		System.out.println("Ваши числа "+x+"\t "+y+"\t "+z);
	}
}
