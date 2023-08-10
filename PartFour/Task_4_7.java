import java.util.*;
class Task_4_7 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, y, z;
		System.out.println("Введите двузначное число ");
		x=in.nextInt();
		y = ((x/10) + (x%10)*10);
		z = y+8;
		System.out.println("Ваши числа "+x+"\t "+y+"\t "+z);
	}
}
