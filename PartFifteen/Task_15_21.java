import java.util.*;
class Task_15_21 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a = 0, sum = 0, sum1 = 0, count = 0, down = 1, up = 999;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	while (count < 1) {
		sum = 0;
		a = down + (int)((up - down + 1)*Math.random());
		count++;
		System.out.print("a = "+a);
		while (sum > 9) {
			sum1 += sum%10;
			sum /= 10;
			while (a > 9) {
				sum += a%10;
				a /= 10;
			}
			//System.out.println("a = "+a+"\tsum = "+sum+"\tcount = "+count);
		}
		System.out.println("\tsum = "+sum1+"\t count = "+count);
	}
	}
}
