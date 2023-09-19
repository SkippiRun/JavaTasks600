import java.util.*;
class Task_15_9 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, a, sum = 0, count = 0, down = 0, up = 10;
	System.out.println("Введите число: ");
	x = in.nextInt();
	a = x;
	while (Math.pow(x, 2) >= sum) {
		a++;
		sum += a;
		//a = down + (int)((up - down + 1)*Math.random());
		//sum += a;
		count++;
		System.out.println("a = "+a+"\tcount = "+count+"\tsum = "+sum);
	}
	System.out.println("\n\na = "+a+"\tcount = "+count+"\tsum = "+sum);
	}
}
