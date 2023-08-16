import java.util.*;
class Task_8_13 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите двузначное число ");
	a = reader.nextInt();
	if ( (a % 10) == (a / 10)) System.out.println ("Цифра единиц и цифра десятков во введенном числе равны");
	else System.out.println("Цифра единиц и цифра десятков во введенном числе НЕ равны");
}
}
