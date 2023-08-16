import java.util.*;
class Task_8_20 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите трехзначное положительное число ");
	a = reader.nextInt();

	if (((a%100)/10 == 0) || ((a%10) == 0)) System.out.println ("Число содержит ноль");
	else System.out.println ("Число НЕ содержит ноль");
}
}
