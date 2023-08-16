import java.util.*;
class Task_8_3 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c;
	System.out.print("Введите двузначное число = ");
	a = reader.nextInt();
	b = a/10;
	c = a%10;
	if (b == c) {
	System.out.println(b + " == " + c);
	}
	else {
	System.out.println(b + " != " + c);
	}
	if (b > c) {
	System.out.println("Цифра десятков во введенном числе больше цифры единиц");
	}
	else if (b < c) {
	System.out.println("Цифра десятков во введенном числе меньше цифры единиц");
	}
	else {
	System.out.println("Цифра десятков во введенном числе равна цифре единиц");
	}

}
}
