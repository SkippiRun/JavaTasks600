import java.util.*;
class Task_15_19 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a = 0, sum = 0, count = 0, down = 1, up = 999;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	while (count < 50) {
		count++;
		a = down + (int)((up - down + 1)*Math.random());
		System.out.print("a = "+a);
		while (a > 0){
			sum += a%10;
			a /= 10;
			//System.out.println("a = "+a+"\tsum = "+sum+"\tcount = "+count);
		}
		System.out.println("\tsum = "+sum+"\t count = "+count);
		sum = 0;
	}
	}
}
