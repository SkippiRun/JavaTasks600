import java.util.*;
class Task_13_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, y, sum = 0, count = 0;
	System.out.println("Введите число: ");
	x = in.nextInt();
	for (int i = 1; i < x; i++){
		if (x%i == 0) {
			sum+=i;
			count++;
			System.out.println("i = "+i+"\t\tsum = "+sum+"\t\tcount = "+count);
		}
	}
	if ((x%count == 0) && (sum%count == 0)) {
		System.out.println("Число "+x+" является дважды делимым");
	}
	else System.out.println("Число "+x+" не является дважды делимым");
	}
}
