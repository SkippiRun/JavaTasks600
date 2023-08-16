import java.util.*;
class Task_8_2 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){

	System.out.print("Введите первое целое число = ");
	int a = reader.nextInt();
	System.out.print("Введите второе целое число = ");
	int b = reader.nextInt();
	if (a%b == 0) {
	System.out.println(a + " делится на " + b + " нацело");
	}
	else {
	System.out.println(a + " не делится на " + b + " нацело");
	}
	if (b%a == 0) {
	a+=2;
	System.out.println("Good");
	}
	else {
	a = 2;
	System.out.println("Bad");
	}
	System.out.println(a);

}
}
