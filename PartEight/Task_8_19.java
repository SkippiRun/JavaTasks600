import java.util.*;
class Task_8_19 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите четырехзначное положительное число ");
	a = reader.nextInt();

	if ((a/100) == (a%100)) System.out.println ("Число парно-симметричное");
	else System.out.println ("Число НЕ парно-симметричное");
}
}
