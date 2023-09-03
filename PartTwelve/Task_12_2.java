import java.util.*;
class Task_12_2 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, count=0;
	for (int i = 1; i <= 15; i++) {
		System.out.print("Введите число: ");
		x = in.nextInt();
		if (x%2 == 0) count++;
	}
	System.out.println("Четные "+count+" чисел");
	}
}
