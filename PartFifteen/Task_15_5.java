import java.util.*;
class Task_15_5 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a = 0, sum = 0, count = 0, down = -999, up = 999;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	while (a != 999) {
		a = down + (int)((up - down + 1)*Math.random());
		sum += a;
		count++;
	}
	System.out.println("count = "+count+"\tsum = "+sum);
	}
}
