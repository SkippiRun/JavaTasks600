import java.util.*;
class Task_8_9 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c;
	System.out.print("Введите первое число = ");
	a = reader.nextInt();
	if (a%2 != 1) {
	b = a/2;
	c = (a+b)%10;
	System.out.println(a+b+c);
	}
	else {
	b = a/2 + 1;
	c = (a*b)%10;
	System.out.println(c-a-b);
}
}
}
