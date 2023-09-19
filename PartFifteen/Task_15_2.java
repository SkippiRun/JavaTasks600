import java.util.*;
class Task_15_2 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a, b;
	System.out.println("Введите числа: ");
	a = in.nextInt();
	b = in.nextInt();
	while (a != b) {
		if (a < b) {
			a++;
			//b--;
		}
		else {
			a--;
			b++;
		}
		System.out.println("a = "+a+"\tb = " +b);
	}
	}
}
