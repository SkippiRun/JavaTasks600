import java.util.*;
class Task_13_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, sum = 0, count = 0, down = 10, up = 99;
	System.out.println("Введите число: ");
	x = in.nextInt();
	for (int i = 1; i <= x; i++){
		//x = down+(int)+((up - down + 1)*Math.random());
		if (x%i == 0) {
			System.out.println("i = "+i);
			count ++;
			sum += i;
		}
	}
	System.out.println("sum = "+sum+"\tcount = "+count);
	}
}
