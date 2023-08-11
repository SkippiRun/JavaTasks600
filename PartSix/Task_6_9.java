import java.util.*;
class Task_6_9 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	int x, y;
	System.out.print("Введите целое трехзначное положительное число ");
	x = in.nextInt();
	if (((x%2==0)&((x%100)%2==0)&((x/100)%2==0))&((x%10!=0)&((x%100)-(x%10)!=0))) System.out.println("четно-красивое");
}
}
