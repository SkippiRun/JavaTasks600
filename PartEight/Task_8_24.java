import java.util.*;
class Task_8_24 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a1, a2, b, c, d;
	System.out.print ("Введите трехзначное число ");
	a1 = reader.nextInt();
	b = a1/100;
	c = a1%100/10;
	d = a1%10;
	if (a1 > 500) {
	a2 = d*100+c*10+b;
	}
	else {
	a2 = b*100+ d*10+c;
	}
	System.out.println("Ввод "+ a1 + "\tВывод " + a2);
}
}
