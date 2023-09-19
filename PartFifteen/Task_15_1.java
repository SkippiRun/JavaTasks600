import java.util.*;
class Task_15_1 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, b, c;
	System.out.println("Введите числа: ");
	a = in.nextInt();
	b = in.nextInt();
	c = in.nextInt();
	while (a % b != 0) {
		a+=c;
		System.out.println(a+";");
	}
	}
}
