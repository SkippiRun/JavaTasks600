import java.util.*;
class Task_15_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int a = 0, sum = 0, count = 0, down = 0, up = 10;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	while (sum < 150) {
		a = down + (int)((up - down + 1)*Math.random());
		sum += a;
		count++;
	}
	System.out.println("count = "+count+"\tsum = "+sum);
	}
}
