import java.util.*;
class Task_13_6 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, y, sum = 0;
	System.out.println("Введите число: ");
	x = in.nextInt();
	for (int i = 1; i < x; i++){
		if (x%i == 0) {
			sum+=i;
			System.out.println("i = "+i+"\tsum = "+sum);
		}
	}
	if (x == sum) {
		System.out.println("Число "+x+" является удивительным");
	}
	else System.out.println("Число "+x+" не является удивительным");
	}
}
