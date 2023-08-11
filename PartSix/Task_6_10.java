import java.util.*;
class Task_6_10 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {

	int x;
	System.out.print("Введите целое двузначное положительное число ");
	x = in.nextInt();
	if (x > ((x%10)*(x/10))) System.out.println("Число больше произведения его цифр");
	else if (x == ((x%10)*(x/10))) System.out.println("Число равно  произведению его цифр");
	else if (x < ((x%10)*(x/10))) System.out.println("Число меньше произведения его цифр");

/*
	int a, a1, a2, b;
	a = in.nextInt();
	a1 = a/10;
	a2 = a%10;
	b = a1*a2;
	if (a>b) System.out.println("Чиcлo больше");
	if (a<b) System.out.println("Пpoизвeдeниe больше");
*/
}
}
