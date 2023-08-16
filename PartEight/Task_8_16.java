import java.util.*;
class Task_8_16 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите трехзначное положительное число ");
	a = reader.nextInt();

	if ((a%10) == (a/100)) System.out.println ("Число симметричное");
	else System.out.println("Число не симметричное");
}
}
