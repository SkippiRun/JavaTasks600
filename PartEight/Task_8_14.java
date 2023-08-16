import java.util.*;
class Task_8_14 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите двузначное число ");
	a = reader.nextInt();
	if ( (a % 10) > (a / 10)) System.out.println ("Цифра единиц больше цифры десятков на " + ((a%10)-(a/10)));
	else System.out.println("Цифра десятков больше цифры единиц на " + ((a/10)-(a%10)));
}
}
