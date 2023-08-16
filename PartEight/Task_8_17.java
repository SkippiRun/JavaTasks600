import java.util.*;
class Task_8_17 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите трехзначное положительное число ");
	a = reader.nextInt();
//	System.out.println(a%10+" "+(a%100)/10+" "+a/100);

	if ((a%2 == 0) && ((a%10 + (a%100)/10 + a/100)%2 == 0)) System.out.println ("Число дважды четное");
	else System.out.println("Число не дважды четное");

}
}
