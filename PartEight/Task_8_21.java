import java.util.*;
class Task_8_21 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b;
	System.out.print ("Введите трехзначное положительное число ");
	a = reader.nextInt();

	if (a%10 != 0){
		if (a%10<5) b = a/1000*1000 + a/100*100 + (a%100)/10*10;
		else b = a/1000*1000 + a/100*100 + (a%100)/10*10 + 10;
	}
	else b = a;
	System.out.println("Ввод "+ a + "\tВывод " + b);
}
}
