import java.util.*;
class Task_8_18 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, count = 0;
	System.out.print ("Введите трехзначное положительное число ");
	a = reader.nextInt();

	if (a%2==0) count ++;
	if ((a/10)%2 == 0) count ++;
	if ((a/100)%2 == 0) count ++;
	System.out.println ("Степень четности = " + count);
}
}
