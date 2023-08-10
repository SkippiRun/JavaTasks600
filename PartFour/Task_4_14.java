import java.util.*;
class Task_4_14 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int x, count = 0;
		System.out.println("Введите трехзначное число ");
		x=in.nextInt();
		if ((x%10) % 2 == 0) count++;
		if (((x%100)/10) % 2 == 0) count++;
		if ((x/100) % 2 == 0) count++;
		System.out.println("Степень четности равна " + count);
	}
}
