import java.util.*;
class Task_9_5 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){

	double a;
	a = in.nextDouble();
	if (a%3==0) System.out.println("Ваш этаж " +(int)(a/3)+"\tКвартира находится справа");
	else if (((a/3)-(int)(a/3) < 0.4) & ((a/3)-(int)(a/3) > 0.3)) System.out.println("Ваш этаж " + (int)(a/3+1)+"\tКвартира находится слева");
	else System.out.println("Ваш этаж " + ((int)(a/3+1))+"\tКвартира находится посередине");
}
}
