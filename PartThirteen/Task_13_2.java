import java.util.*;
class Task_13_2 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int x, sum = 0, down = 10, up = 99;
	for (int i=0; i<20; i++){
		x = down+(int)+((up - down + 1)*Math.random());
		sum +=x;
	}
	System.out.println("sum = "+sum);
	}
}
